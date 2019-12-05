package be.thomasmore.lyrics.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private Message message;

    @JsonProperty("message")
    public Message getMessage() { return message; }
    @JsonProperty("message")
    public void setMessage(Message value) { this.message = value; }
}
