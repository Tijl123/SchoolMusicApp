package be.thomasmore.MusicEdgeService.models;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Artist {
    private UUID id;
    private String name;
    private List<Album> albums;
}
