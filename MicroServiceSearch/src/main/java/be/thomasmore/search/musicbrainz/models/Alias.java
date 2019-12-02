package be.thomasmore.search.musicbrainz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Alias {
    private String sortName;
    private String typeID;
    private String name;
    private String locale;
    private String type;
    private Boolean primary;
    private Object beginDate;
    private Object endDate;

    @JsonProperty("sort-name")
    public String getSortName() { return sortName; }
    @JsonProperty("sort-name")
    public void setSortName(String value) { this.sortName = value; }

    @JsonProperty("type-id")
    public String getTypeID() { return typeID; }
    @JsonProperty("type-id")
    public void setTypeID(String value) { this.typeID = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("locale")
    public String getLocale() { return locale; }
    @JsonProperty("locale")
    public void setLocale(String value) { this.locale = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("primary")
    public Boolean getPrimary() { return primary; }
    @JsonProperty("primary")
    public void setPrimary(Boolean value) { this.primary = value; }

    @JsonProperty("begin-date")
    public Object getBeginDate() { return beginDate; }
    @JsonProperty("begin-date")
    public void setBeginDate(Object value) { this.beginDate = value; }

    @JsonProperty("end-date")
    public Object getEndDate() { return endDate; }
    @JsonProperty("end-date")
    public void setEndDate(Object value) { this.endDate = value; }
}
