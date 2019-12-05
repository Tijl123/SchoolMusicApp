package be.thomasmore.MusicEdgeService.models;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class Album {
    private UUID id;
    private String title;
    private List<Artist> artists;
    private List<Track> tracks;
}
