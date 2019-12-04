package be.thomasmore.lyrics.api.models;

import be.thomasmore.lyrics.api.models.Body;
import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    private Body body;

    @JsonProperty("body")
    public Body getBody() { return body; }
    @JsonProperty("body")
    public void setBody(Body value) { this.body = value; }
}
