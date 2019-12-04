package be.thomasmore.search.entity;

import be.thomasmore.search.musicbrainz.models.Recording;
import be.thomasmore.search.musicbrainz.models.RecordingArtistCredit;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class Track {
    @Id
    private UUID id;
    private String title;
    private long length;
    private Album[] albums;
    private Artist[] artists;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }

    public Artist[] getArtists() {
        return artists;
    }

    public void setArtists(Artist[] artists) {
        this.artists = artists;
    }

    public Track(Recording rec) {
        id = rec.getID();
        title = rec.getTitle();
        length = rec.getLength();

        RecordingArtistCredit[] credits = rec.getArtistCredit();
        if (credits != null) {
            artists = new Artist[credits.length];
            for (int i = 0; i < credits.length; i++) {
                artists[i] = new Artist(credits[i]);
            }
        }
    }

    public Track(be.thomasmore.search.musicbrainz.models.Track track) {
        id = track.getID();
        title = track.getTitle();
        length = track.getLength();
    }
}
