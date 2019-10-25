package be.thomasmore.search.musicbrainz;

import be.thomasmore.search.entity.Album;
import be.thomasmore.search.entity.Artist;
import be.thomasmore.search.entity.Track;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class MusicBrainzApi {
    private final String ApiBase = "http://musicbrainz.org/ws/2/";

    public List<Track> searchTrack(String query) {
        return Arrays.asList(
                new Track(),
                new Track()
        );
    }

    public List<Album> searchAlbum(String query) {
        return Arrays.asList(
                new Album(),
                new Album()
        );
    }

    public List<Artist> searchArtist(String query) {
        return Arrays.asList(
                new Artist(),
                new Artist()
        );
    }

    public Track getTrack(UUID uuid) {
        return new Track();
    }

    public Album getAlbum(UUID uuid) {
        return new Album();
    }

    public Artist getArtist(UUID uuid) {
        return new Artist();
    }
}
