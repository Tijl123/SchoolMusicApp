package be.thomasmore.MusicEdgeService.models;

import lombok.Data;

@Data
public class Track {
    private String title;
    private int length;
    private Album[] albums;
    private Artist[] artist;
    private String mp3;

    public Track(String title, int length, String mp3) {
        this.title = title;
        this.length = length;
        this.mp3 = mp3;
    }

    public Track() {
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }

    public Artist[] getArtist() {
        return artist;
    }

    public void setArtist(Artist[] artist) {
        this.artist = artist;
    }

    public String getMp3() {
        return mp3;
    }

    public void setMp3(String mp3) {
        this.mp3 = mp3;
    }
}
