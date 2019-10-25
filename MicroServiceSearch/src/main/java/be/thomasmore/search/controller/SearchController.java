package be.thomasmore.search.controller;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import be.thomasmore.search.entity.Album;
import be.thomasmore.search.entity.Artist;
import be.thomasmore.search.entity.Track;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SearchController {
    @RequestMapping("/track/search/{query}")
    public List<Track> searchTrackByString(@PathVariable("query") String query) {
        return Arrays.asList(
                new Track(),
                new Track()
        );
    }

    @RequestMapping("/track/id/{uuid}")
    public Track searchTrackById(@PathVariable("uuid") UUID uuid) {
        return new Track();
    }
    @RequestMapping("/album/search/{query}")
    public List<Album> searchAlbumByString(@PathVariable("query") String query) {
        return Arrays.asList(
                new Album(),
                new Album()
        );
    }

    @RequestMapping("/album/id/{uuid}")
    public Album searchAlbumById(@PathVariable("uuid") UUID uuid) {
        return new Album();
    }
    @RequestMapping("/artist/search/{query}")
    public List<Artist> searchArtistByString(@PathVariable("query") String query) {
        return Arrays.asList(
                new Artist(),
                new Artist()
        );
    }

    @RequestMapping("/artist/id/{uuid}")
    public Artist searchArtistById(@PathVariable("uuid") UUID uuid) {
        return new Artist();
    }
}
