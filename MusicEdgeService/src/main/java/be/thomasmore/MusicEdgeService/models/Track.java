package be.thomasmore.MusicEdgeService.models;

import lombok.Data;

@Data
public class Track {
    private String title;
    private int length;
    private Album[] albums;
    private Artist[] artist;
    private String mp3;
}
