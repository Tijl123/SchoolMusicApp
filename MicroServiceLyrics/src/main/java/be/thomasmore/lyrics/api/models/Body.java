package be.thomasmore.lyrics.api.models;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Body {
    private Lyrics lyrics;

    @JsonProperty("lyrics")
    public Lyrics getLyrics() { return lyrics; }
    @JsonProperty("lyrics")
    public void setLyrics(Lyrics value) { this.lyrics = value; }
}
