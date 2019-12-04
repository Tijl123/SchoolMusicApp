package be.thomasmore.lyrics.api;

import be.thomasmore.lyrics.entity.Lyrics;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;


public class MusixMatch {

    private static final String apiBase = "https://api.musixmatch.com/ws/1.1/";
    private static final String apiKey= "&apikey=0b105923501aaeef98bf19d23c0b05b6";

    public Lyrics searchLyrics(UUID trackId) {
        return new Lyrics(lyricsRequest(trackId, be.thomasmore.lyrics.api.models.Lyrics.class), trackId);
    };

    private <T> T lyricsRequest(UUID id, Class<T> typeClass) {
        try {
            String s = sendApiRequest("track.lyrics.get?format=jsonp&callback=callback&track_mbid=" + id);
            ObjectMapper mapper = new ObjectMapper();
            mapper.readerFor(typeClass);
            return mapper.readValue(s, typeClass);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String sendApiRequest(String url) throws Exception {
        URL combinedURL = new URL(apiBase + url + apiKey);
        URLConnection yc = combinedURL.openConnection();
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
