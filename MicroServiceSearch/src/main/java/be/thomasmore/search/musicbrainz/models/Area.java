package be.thomasmore.search.musicbrainz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Area {
    private String id;
    // private AreaType type;
    private String typeID;
    private String name;
    private String sortName;
    // private AreaLifeSpan lifeSpan;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("type-id")
    public String getTypeID() { return typeID; }
    @JsonProperty("type-id")
    public void setTypeID(String value) { this.typeID = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("sort-name")
    public String getSortName() { return sortName; }
    @JsonProperty("sort-name")
    public void setSortName(String value) { this.sortName = value; }
}