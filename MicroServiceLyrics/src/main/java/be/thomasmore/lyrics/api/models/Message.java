package be.thomasmore.lyrics.api.models;

import be.thomasmore.lyrics.api.models.Body;
import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    private Header header;
    private Body body;

    @JsonProperty("header")
    public Header getHeader() { return header; }
    @JsonProperty("header")
    public void setHeader(Header value) { this.header = value; }

    @JsonProperty("body")
    public Body getBody() { return body; }
    @JsonProperty("body")
    public void setBody(Body value) { this.body = value; }
}
