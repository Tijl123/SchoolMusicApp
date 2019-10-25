package be.thomasmore.MusicEdgeService.models;

import lombok.Data;

import java.util.Date;

@Data
public class Album {
    private String title;
    private int artistId;
    private Date releaseDate;
    private String albumCoverUrl;
}
