package be.thomasmore.search.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class Track {
    @Id
    private UUID id;
    private String title;
    private int length;
    private Album[] albums;
    private Artist[] artist;
}
