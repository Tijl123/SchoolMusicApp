package be.thomasmore.search.controller;

import be.thomasmore.search.entity.SearchResult;
import be.thomasmore.search.musicbrainz.MusicBrainzApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SearchController {
    private final MusicBrainzApi api;

    public SearchController(MusicBrainzApi api) {
        this.api = api;
    }

    @RequestMapping("/search")
    public SearchResult search(
            @RequestParam(value = "album", required = false) String album,
            @RequestParam(value = "artist", required = false) String artist,
            @RequestParam(value = "track", required = false) String track) {
        return new SearchResult(
                album == null ? null : api.searchAlbum(album),
                artist == null ? null : api.searchArtist(artist),
                track == null ? null : api.searchTrack(track)
        );
    }

    /*
    @RequestMapping("/track/id/{uuid}")
    public Track searchTrackById(@PathVariable("uuid") UUID uuid) {
        return api.getTrack(uuid);
    }

    @RequestMapping("/album/id/{uuid}")
    public Album searchAlbumById(@PathVariable("uuid") UUID uuid) {
        return api.getAlbum(uuid);
    }

    @RequestMapping("/artist/id/{uuid}")
    public Artist searchArtistById(@PathVariable("uuid") UUID uuid) {
        return api.getArtist(uuid);
    }
     */
}
