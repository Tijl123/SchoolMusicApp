package be.thomasmore.search.musicbrainz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class APIResponseArtists {
    private String created;
    private long count;
    private long offset;
    private Artist[] artists;

    @JsonProperty("created")
    public String getCreated() { return created; }
    @JsonProperty("created")
    public void setCreated(String value) { this.created = value; }

    @JsonProperty("count")
    public long getCount() { return count; }
    @JsonProperty("count")
    public void setCount(long value) { this.count = value; }

    @JsonProperty("offset")
    public long getOffset() { return offset; }
    @JsonProperty("offset")
    public void setOffset(long value) { this.offset = value; }

    @JsonProperty("artists")
    public Artist[] getArtists() { return artists; }
    @JsonProperty("artists")
    public void setArtists(Artist[] value) { this.artists = value; }
}