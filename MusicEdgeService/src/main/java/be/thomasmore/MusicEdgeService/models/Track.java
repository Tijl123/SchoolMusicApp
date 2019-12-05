package be.thomasmore.MusicEdgeService.models;

import lombok.Data;

import java.util.UUID;

@Data
public class Track {
    private UUID id;
    private String title;
    private long length;
    private Album[] albums;
    private Artist[] artists;
}
