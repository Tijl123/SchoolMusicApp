package be.thomasmore.search.musicbrainz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReleaseArtistCredit {
    private String name;
    private Artist artist;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("artist")
    public Artist getArtist() { return artist; }
    @JsonProperty("artist")
    public void setArtist(Artist value) { this.artist = value; }
}
