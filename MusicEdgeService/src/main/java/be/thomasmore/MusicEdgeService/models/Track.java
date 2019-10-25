package be.thomasmore.MusicEdgeService.models;

import lombok.Data;

@Data
public class Track {
    private String title;
    private int duration;
    private int albumId;
    private String mp3;
}
