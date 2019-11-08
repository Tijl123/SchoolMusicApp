package be.thomasmore.search.musicbrainz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Release {
    private String id;
    private long count;
    private String title;
    private String status;
    private ReleaseArtistCredit[] artistCredit;
    private ReleaseGroup releaseGroup;
    private String date;
    private String country;
    private ReleaseEvent[] releaseEvents;
    private long trackCount;
    private Media[] media;
    private String disambiguation;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("count")
    public long getCount() { return count; }
    @JsonProperty("count")
    public void setCount(long value) { this.count = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("artist-credit")
    public ReleaseArtistCredit[] getArtistCredit() { return artistCredit; }
    @JsonProperty("artist-credit")
    public void setArtistCredit(ReleaseArtistCredit[] value) { this.artistCredit = value; }

    @JsonProperty("release-group")
    public ReleaseGroup getReleaseGroup() { return releaseGroup; }
    @JsonProperty("release-group")
    public void setReleaseGroup(ReleaseGroup value) { this.releaseGroup = value; }

    @JsonProperty("date")
    public String getDate() { return date; }
    @JsonProperty("date")
    public void setDate(String value) { this.date = value; }

    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String value) { this.country = value; }

    @JsonProperty("release-events")
    public ReleaseEvent[] getReleaseEvents() { return releaseEvents; }
    @JsonProperty("release-events")
    public void setReleaseEvents(ReleaseEvent[] value) { this.releaseEvents = value; }

    @JsonProperty("track-count")
    public long getTrackCount() { return trackCount; }
    @JsonProperty("track-count")
    public void setTrackCount(long value) { this.trackCount = value; }

    @JsonProperty("media")
    public Media[] getMedia() { return media; }
    @JsonProperty("media")
    public void setMedia(Media[] value) { this.media = value; }

    @JsonProperty("disambiguation")
    public String getDisambiguation() { return disambiguation; }
    @JsonProperty("disambiguation")
    public void setDisambiguation(String value) { this.disambiguation = value; }
}
