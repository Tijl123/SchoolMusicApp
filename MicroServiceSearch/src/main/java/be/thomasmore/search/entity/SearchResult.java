package be.thomasmore.search.entity;

import java.util.List;

public class SearchResult {
    private List<Album> albums;
    private List<Artist> artists;
    private List<Track> tracks;

    public SearchResult(List<Album> albums, List<Artist> artists, List<Track> tracks) {
        this.albums = albums;
        this.artists = artists;
        this.tracks = tracks;
    }

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
}
