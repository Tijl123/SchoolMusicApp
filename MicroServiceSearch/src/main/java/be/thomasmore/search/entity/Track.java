package be.thomasmore.search.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class Track {
    private UUID id;
    private String title;
    private int length;
    private Album[] albums;
    private Artist[] artist;
}
