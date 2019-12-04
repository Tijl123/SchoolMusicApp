package be.thomasmore.lyrics.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Lyrics {

    private int id;
    private String lyrics;

    @JsonProperty("lyrics_id")
    public int getId() { return id; }
    @JsonProperty("lyrics_id")
    public void setId(int value) { this.id = value; }

    @JsonProperty("lyrics_body")
    public String getLyrics() { return lyrics; }
    @JsonProperty("lyrics_body")
    public void setLyrics(String value) { this.lyrics = value; }

}
