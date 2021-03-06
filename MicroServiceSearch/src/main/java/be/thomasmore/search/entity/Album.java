package be.thomasmore.search.entity;

import be.thomasmore.search.musicbrainz.models.Media;
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
    private List<Track> tracks;

    public Album() {

    }

    public Album(Release rel) {
        id = rel.getID();
        title = rel.getTitle();
        if (rel.getArtistCredit() != null) {
            artists = Arrays.stream(rel.getArtistCredit()).map(ReleaseArtistCredit::getArtist).map(Artist::new).collect(Collectors.toList());
        }
        if (rel.getMedia() != null && rel.getMedia().length != 0) {
            Media m = rel.getMedia()[0];
            if (m.getTracks() != null) {
                tracks = Arrays.stream(m.getTracks()).map(be.thomasmore.search.musicbrainz.models.Track::getRecording).map(Track::new).collect(Collectors.toList());
            }
        }
    }
}
