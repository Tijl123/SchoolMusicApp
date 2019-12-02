package be.thomasmore.search.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection="musicbrainz.results.cached")
public class SearchResult {
    private final String album;
    private final String artist;
    private final String track;
    private List<Album> albums;
    private List<Artist> artists;
    private List<Track> tracks;

    public SearchResult(String album, String artist, String track, List<Album> albums, List<Artist> artists, List<Track> tracks) {
        this.album = album;
        this.artist = artist;
        this.track = track;
        this.albums = albums;
        this.artists = artists;
        this.tracks = tracks;
    }
}
