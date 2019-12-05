package be.thomasmore.MusicEdgeService.models;

import lombok.Data;

import java.util.Date;

@Data
public class Album {
    private String title;
    private int artistId;
    private Date releaseDate;
    private String albumCoverUrl;

    public Album(String title, int artistId, Date releaseDate, String albumCoverUrl) {
        this.title = title;
        this.artistId = artistId;
        this.releaseDate = releaseDate;
        this.albumCoverUrl = albumCoverUrl;
    }

    public Album() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAlbumCoverUrl() {
        return albumCoverUrl;
    }

    public void setAlbumCoverUrl(String albumCoverUrl) {
        this.albumCoverUrl = albumCoverUrl;
    }
}
