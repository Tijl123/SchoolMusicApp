package be.thomasmore.search.musicbrainz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReleaseGroup {
    private String id;
    private String typeID;
    private String title;
    private String primaryType;
    private String[] secondaryTypes;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("type-id")
    public String getTypeID() { return typeID; }
    @JsonProperty("type-id")
    public void setTypeID(String value) { this.typeID = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("primary-type")
    public String getPrimaryType() { return primaryType; }
    @JsonProperty("primary-type")
    public void setPrimaryType(String value) { this.primaryType = value; }

    @JsonProperty("secondary-types")
    public String[] getSecondaryTypes() { return secondaryTypes; }
    @JsonProperty("secondary-types")
    public void setSecondaryTypes(String[] value) { this.secondaryTypes = value; }
}
