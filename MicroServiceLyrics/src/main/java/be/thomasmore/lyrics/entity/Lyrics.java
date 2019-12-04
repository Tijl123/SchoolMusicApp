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
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="lyrics")
    private String lyrics;

    @Column(name="trackId")
    private UUID trackId;

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

    public Lyrics(be.thomasmore.lyrics.api.models.Lyrics x, UUID trackId) {
        id = x.getId();
        lyrics = x.getLyrics();
        this.trackId = trackId;
    }

}
