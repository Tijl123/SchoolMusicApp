package be.thomasmore.search.entity;

import be.thomasmore.search.musicbrainz.models.RecordingArtistCredit;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
public class Artist {
    @Id
    private UUID id;
    private String name;
    private List<Album> albums;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public Artist() {

    }

    public Artist(be.thomasmore.search.musicbrainz.models.Artist x) {
        id = x.getID();
        name = x.getName();
        if (x.getReleases() != null) {
            albums = Arrays.stream(x.getReleases()).map(Album::new).collect(Collectors.toList());
        }
    }

    public Artist(RecordingArtistCredit credit) {
        id = credit.getArtist().getID();
        name = credit.getArtist().getName();
    }
}
