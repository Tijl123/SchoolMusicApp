package be.thomasmore.search.entity;

import be.thomasmore.search.musicbrainz.models.Release;
import be.thomasmore.search.musicbrainz.models.ReleaseArtistCredit;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
public class Album {
    @Id
    private UUID id;
    private String title;
    private List<Artist> artists;
    // TODO: tracks

    public Album(Release rel) {
        id = rel.getID();
        title = rel.getTitle();
        artists = Arrays.stream(rel.getArtistCredit()).map(ReleaseArtistCredit::getArtist).map(Artist::new).collect(Collectors.toList());
    }
}
