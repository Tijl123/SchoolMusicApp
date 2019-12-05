package be.thomasmore.lyrics.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Lyrics {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="lyrics", columnDefinition = "TEXT")
    private String lyrics;

    @Column(name="trackId")
    private UUID trackId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

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

    public Lyrics(be.thomasmore.lyrics.api.models.Lyrics x, UUID trackId) {
        this.id = x.getLyricsID();
        this.lyrics = x.getLyricsBody();
        this.trackId = trackId;
    }

}
