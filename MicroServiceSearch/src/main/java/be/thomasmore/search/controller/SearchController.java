package be.thomasmore.search.controller;

import be.thomasmore.search.entity.Album;
import be.thomasmore.search.entity.Artist;
import be.thomasmore.search.entity.SearchResult;
import be.thomasmore.search.entity.Track;
import be.thomasmore.search.musicbrainz.MusicBrainzApi;
import be.thomasmore.search.repository.SearchRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/")
public class SearchController {
    private final MusicBrainzApi api;

    private final SearchRepository repository;

    public SearchController(MusicBrainzApi api, SearchRepository repository) {
        this.api = api;
        this.repository = repository;
    }

    @RequestMapping("/search")
    public SearchResult search(
            @RequestParam(value = "album", required = false) String album,
            @RequestParam(value = "artist", required = false) String artist,
            @RequestParam(value = "track", required = false) String track) {

        SearchResult cached = repository.findByAlbumAndArtistAndTrack(album, artist, track);

        if (cached != null) {
            return cached;
        }

        SearchResult fetched =  new SearchResult(
                album, artist, track,
                album == null ? null : api.searchAlbum(album),
                artist == null ? null : api.searchArtist(artist),
                track == null ? null : api.searchTrack(track)
        );

        repository.insert(fetched);

        return fetched;
    }

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
}
