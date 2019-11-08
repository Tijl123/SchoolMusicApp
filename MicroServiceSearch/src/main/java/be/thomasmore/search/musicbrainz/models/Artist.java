package be.thomasmore.search.musicbrainz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {
    private String id;
    private String name;
    private String sortName;
    private String disambiguation;
    private Alias[] aliases;
    private String[] iso31661Codes;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("sort-name")
    public String getSortName() { return sortName; }
    @JsonProperty("sort-name")
    public void setSortName(String value) { this.sortName = value; }

    @JsonProperty("disambiguation")
    public String getDisambiguation() { return disambiguation; }
    @JsonProperty("disambiguation")
    public void setDisambiguation(String value) { this.disambiguation = value; }

    @JsonProperty("aliases")
    public Alias[] getAliases() { return aliases; }
    @JsonProperty("aliases")
    public void setAliases(Alias[] value) { this.aliases = value; }

    @JsonProperty("iso-3166-1-codes")
    public String[] getIso31661Codes() { return iso31661Codes; }
    @JsonProperty("iso-3166-1-codes")
    public void setIso31661Codes(String[] value) { this.iso31661Codes = value; }
}
