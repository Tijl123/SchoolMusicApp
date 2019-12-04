package be.thomasmore.search.musicbrainz;

import be.thomasmore.search.entity.Album;
import be.thomasmore.search.entity.Artist;
import be.thomasmore.search.entity.Track;
import be.thomasmore.search.musicbrainz.models.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class MusicBrainzApi {
    private static final String ApiBase = "http://musicbrainz.org/ws/2/";

    public List<Track> searchTrack(String query) {
        try {
            APIResponseRecordings x = sendSearchRequest("recording", query, APIResponseRecordings.class);
            return Arrays.stream(x.getRecordings()).map(Track::new).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<Album> searchAlbum(String query) {
        try {
            ApiResponseReleases x = sendSearchRequest("release", query, ApiResponseReleases.class);
            return Arrays.stream(x.getReleases()).map(Album::new).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<Artist> searchArtist(String query) {
        try {
            APIResponseArtists x = sendSearchRequest("artist", query, APIResponseArtists.class);
            return Arrays.stream(x.getArtists()).map(Artist::new).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public Track getTrack(UUID uuid) {
        return new Track(sendLookupRequest("recording", uuid, "", Recording.class));
    }

    public Album getAlbum(UUID uuid) {
        return new Album(sendLookupRequest("release", uuid, "recordings", Release.class));
    }

    public Artist getArtist(UUID uuid) {
        return new Artist(sendLookupRequest("artist", uuid, "releases", be.thomasmore.search.musicbrainz.models.Artist.class));
    }

    private <T> T sendLookupRequest(String type, UUID id, String inc, Class<T> typeClass) {
        try {
            String s = sendApiRequest(type + "/" + id + "?inc=" + inc + "&fmt=json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.readerFor(typeClass);
            return mapper.readValue(s, typeClass);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private <T> T sendSearchRequest(String type, String query, Class<T> typeClass) {
        try {
            String s = sendApiRequest(type + "?query=" + URLEncoder.encode(query, "UTF-8") + "&fmt=json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.readerFor(typeClass);
            return mapper.readValue(s, typeClass);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String sendApiRequest(String url) throws Exception {
        URL yahoo = new URL(ApiBase + url);
        URLConnection yc = yahoo.openConnection();
        return convertInputStreamToString(yc.getInputStream());
    }

    private static String convertInputStreamToString(InputStream stream) throws IOException {
        StringBuilder textBuilder = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader(stream, Charset.forName(StandardCharsets.UTF_8.name())))) {
            int c;
            while ((c = reader.read()) != -1) {
                textBuilder.append((char) c);
            }
        }
        return textBuilder.toString();
    }
}
