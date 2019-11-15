package be.thomasmore.search.entity;

import be.thomasmore.search.musicbrainz.models.Release;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class Album {
    @Id
    private UUID id;
    private String title;
    // TODO: artists, tracks

    public Album(Release rel) {
        id = rel.getID();
        title = rel.getTitle();
    }
}
