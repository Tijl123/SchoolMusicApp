package be.thomasmore.MusicEdgeService.models;

import lombok.Data;

import java.util.List;

@Data
public class SearchResult {
    private String album;
    private String artist;
    private String track;
    private List<Album> albums;
    private List<Artist> artists;
    private List<Track> tracks;

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public SearchResult() {

    }

    public SearchResult(String album, String artist, String track, List<Album> albums, List<Artist> artists, List<Track> tracks) {
        this.album = album;
        this.artist = artist;
        this.track = track;
        this.albums = albums;
        this.artists = artists;
        this.tracks = tracks;
    }
}
