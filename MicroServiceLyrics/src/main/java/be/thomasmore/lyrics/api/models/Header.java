package be.thomasmore.lyrics.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Header {
    private long statusCode;
    private double executeTime;

    @JsonProperty("status_code")
    public long getStatusCode() { return statusCode; }
    @JsonProperty("status_code")
    public void setStatusCode(long value) { this.statusCode = value; }

    @JsonProperty("execute_time")
    public double getExecuteTime() { return executeTime; }
    @JsonProperty("execute_time")
    public void setExecuteTime(double value) { this.executeTime = value; }
}
