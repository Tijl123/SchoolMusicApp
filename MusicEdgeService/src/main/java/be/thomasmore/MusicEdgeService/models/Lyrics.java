package be.thomasmore.MusicEdgeService.models;

import java.util.UUID;

public class Lyrics {

    private int id;
    private String lyrics;
    private UUID trackId;


    public Lyrics(int id, String lyrics, UUID trackId) {
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

    public UUID getTrackId() {
        return trackId;
    }

    public void setTrackId(UUID trackId) {
        this.trackId = trackId;
    }
}
