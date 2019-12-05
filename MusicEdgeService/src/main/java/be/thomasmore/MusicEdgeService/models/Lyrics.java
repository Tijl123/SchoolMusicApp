package be.thomasmore.MusicEdgeService.models;

public class Lyrics {

    private int id;
    private String lyrics;
    private int trackId;


    public Lyrics(int id, String lyrics, int trackId) {
        this.id = id;
        this.lyrics = lyrics;
        this.trackId = trackId;
    }

    public Lyrics() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }
}
