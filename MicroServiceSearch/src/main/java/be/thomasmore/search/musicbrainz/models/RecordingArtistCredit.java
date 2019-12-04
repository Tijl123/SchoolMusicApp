package be.thomasmore.search.musicbrainz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecordingArtistCredit {
    private UUID id;
    private String name;
    private Artist artist;
    private String joinphrase;

    @JsonProperty("id")
    public UUID getID() { return id; }
    @JsonProperty("id")
    public void setID(UUID value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("artist")
    public Artist getArtist() { return artist; }
    @JsonProperty("artist")
    public void setArtist(Artist value) { this.artist = value; }

    @JsonProperty("joinphrase")
    public String getJoinphrase() { return joinphrase; }
    @JsonProperty("joinphrase")
    public void setJoinphrase(String value) { this.joinphrase = value; }
}
