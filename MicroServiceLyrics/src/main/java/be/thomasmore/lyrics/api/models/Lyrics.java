package be.thomasmore.lyrics.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Lyrics {
    private long lyricsID;
    private long explicit;
    private String lyricsBody;
    private String scriptTrackingURL;
    private String pixelTrackingURL;
    private String lyricsCopyright;
    private String updatedTime;

    @JsonProperty("lyrics_id")
    public long getLyricsID() { return lyricsID; }
    @JsonProperty("lyrics_id")
    public void setLyricsID(long value) { this.lyricsID = value; }

    @JsonProperty("explicit")
    public long getExplicit() { return explicit; }
    @JsonProperty("explicit")
    public void setExplicit(long value) { this.explicit = value; }

    @JsonProperty("lyrics_body")
    public String getLyricsBody() { return lyricsBody; }
    @JsonProperty("lyrics_body")
    public void setLyricsBody(String value) { this.lyricsBody = value; }

    @JsonProperty("script_tracking_url")
    public String getScriptTrackingURL() { return scriptTrackingURL; }
    @JsonProperty("script_tracking_url")
    public void setScriptTrackingURL(String value) { this.scriptTrackingURL = value; }

    @JsonProperty("pixel_tracking_url")
    public String getPixelTrackingURL() { return pixelTrackingURL; }
    @JsonProperty("pixel_tracking_url")
    public void setPixelTrackingURL(String value) { this.pixelTrackingURL = value; }

    @JsonProperty("lyrics_copyright")
    public String getLyricsCopyright() { return lyricsCopyright; }
    @JsonProperty("lyrics_copyright")
    public void setLyricsCopyright(String value) { this.lyricsCopyright = value; }

    @JsonProperty("updated_time")
    public String getUpdatedTime() { return updatedTime; }
    @JsonProperty("updated_time")
    public void setUpdatedTime(String value) { this.updatedTime = value; }
}
