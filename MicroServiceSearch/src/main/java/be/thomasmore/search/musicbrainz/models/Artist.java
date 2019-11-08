package be.thomasmore.search.musicbrainz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {
    private UUID id;
    private String type;
    // private String typeID;
    private String name;
    private String sortName;
    private String gender;
    private String country;
    private Area area;
    private Area beginArea;
    private String disambiguation;
    // private ArtistLifeSpan lifeSpan;
    private Tag[] tags;
    private Alias[] aliases;
    private String[] iso31661Codes;

    @JsonProperty("id")
    public UUID getID() { return id; }
    @JsonProperty("id")
    public void setID(UUID value) { this.id = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("sort-name")
    public String getSortName() { return sortName; }
    @JsonProperty("sort-name")
    public void setSortName(String value) { this.sortName = value; }

    @JsonProperty("gender")
    public String getGender() { return gender; }
    @JsonProperty("gender")
    public void setGender(String value) { this.gender = value; }

    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String value) { this.country = value; }

    @JsonProperty("area")
    public Area getArea() { return area; }
    @JsonProperty("area")
    public void setArea(Area value) { this.area = value; }

    @JsonProperty("begin-area")
    public Area getBeginArea() { return beginArea; }
    @JsonProperty("begin-area")
    public void setBeginArea(Area value) { this.beginArea = value; }

    @JsonProperty("disambiguation")
    public String getDisambiguation() { return disambiguation; }
    @JsonProperty("disambiguation")
    public void setDisambiguation(String value) { this.disambiguation = value; }

    @JsonProperty("tags")
    public Tag[] getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(Tag[] value) { this.tags = value; }

    @JsonProperty("aliases")
    public Alias[] getAliases() { return aliases; }
    @JsonProperty("aliases")
    public void setAliases(Alias[] value) { this.aliases = value; }

    @JsonProperty("iso-3166-1-codes")
    public String[] getIso31661Codes() { return iso31661Codes; }
    @JsonProperty("iso-3166-1-codes")
    public void setIso31661Codes(String[] value) { this.iso31661Codes = value; }
}
