package be.thomasmore.search.musicbrainz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recording {
    private UUID id;
    private long score;
    private String title;
    private long length;
    private Boolean video;
    private RecordingArtistCredit[] artistCredit;
    private Release[] releases;
    private String disambiguation;
    private String[] isrcs;
    private Tag[] tags;

    @JsonProperty("id")
    public UUID getID() { return id; }
    @JsonProperty("id")
    public void setID(UUID value) { this.id = value; }

    @JsonProperty("score")
    public long getScore() { return score; }
    @JsonProperty("score")
    public void setScore(long value) { this.score = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("length")
    public long getLength() { return length; }
    @JsonProperty("length")
    public void setLength(long value) { this.length = value; }

    @JsonProperty("video")
    public Boolean getVideo() { return video; }
    @JsonProperty("video")
    public void setVideo(Boolean value) { this.video = value; }

    @JsonProperty("artist-credit")
    public RecordingArtistCredit[] getArtistCredit() { return artistCredit; }
    @JsonProperty("artist-credit")
    public void setArtistCredit(RecordingArtistCredit[] value) { this.artistCredit = value; }

    @JsonProperty("releases")
    public Release[] getReleases() { return releases; }
    @JsonProperty("releases")
    public void setReleases(Release[] value) { this.releases = value; }

    @JsonProperty("disambiguation")
    public String getDisambiguation() { return disambiguation; }
    @JsonProperty("disambiguation")
    public void setDisambiguation(String value) { this.disambiguation = value; }

    @JsonProperty("isrcs")
    public String[] getIsrcs() { return isrcs; }
    @JsonProperty("isrcs")
    public void setIsrcs(String[] value) { this.isrcs = value; }

    @JsonProperty("tags")
    public Tag[] getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(Tag[] value) { this.tags = value; }
}
