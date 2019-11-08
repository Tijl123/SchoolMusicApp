package be.thomasmore.search.musicbrainz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Media {
    private long position;
    private String format;
    private Track[] track;
    private long trackCount;
    private long trackOffset;

    @JsonProperty("position")
    public long getPosition() { return position; }
    @JsonProperty("position")
    public void setPosition(long value) { this.position = value; }

    @JsonProperty("format")
    public String getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(String value) { this.format = value; }

    @JsonProperty("track")
    public Track[] getTrack() { return track; }
    @JsonProperty("track")
    public void setTrack(Track[] value) { this.track = value; }

    @JsonProperty("track-count")
    public long getTrackCount() { return trackCount; }
    @JsonProperty("track-count")
    public void setTrackCount(long value) { this.trackCount = value; }

    @JsonProperty("track-offset")
    public long getTrackOffset() { return trackOffset; }
    @JsonProperty("track-offset")
    public void setTrackOffset(long value) { this.trackOffset = value; }
}
