package be.thomasmore.search.controller;

import be.thomasmore.search.entity.Album;
import be.thomasmore.search.entity.Artist;
import be.thomasmore.search.entity.Track;
import be.thomasmore.search.musicbrainz.MusicBrainzApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class SearchController {
    private final MusicBrainzApi api;

    public SearchController(MusicBrainzApi api) {
        this.api = api;
    }

    @RequestMapping("/track/search/{query}")
    public List<Track> searchTrackByString(@PathVariable("query") String query) {
        return api.searchTrack(query);
    }

    @RequestMapping("/track/id/{uuid}")
    public Track searchTrackById(@PathVariable("uuid") UUID uuid) {
        return api.getTrack(uuid);
    }
    @RequestMapping("/album/search/{query}")
    public List<Album> searchAlbumByString(@PathVariable("query") String query) {
        return api.searchAlbum(query);
    }

    @RequestMapping("/album/id/{uuid}")
    public Album searchAlbumById(@PathVariable("uuid") UUID uuid) {
        return api.getAlbum(uuid);
    }
    @RequestMapping("/artist/search/{query}")
    public List<Artist> searchArtistByString(@PathVariable("query") String query) {
        return api.searchArtist(query);
    }

    @RequestMapping("/artist/id/{uuid}")
    public Artist searchArtistById(@PathVariable("uuid") UUID uuid) {
        return api.getArtist(uuid);
    }
}
