package be.thomasmore.lyrics.controller;

import be.thomasmore.lyrics.api.MusixMatch;
import be.thomasmore.lyrics.entity.Lyrics;
import be.thomasmore.lyrics.repository.LyricsRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class LyricsController {

    private final MusixMatch api;

    private final LyricsRepository repository;

    public LyricsController(MusixMatch api, LyricsRepository repository) {
        this.api = api;
        this.repository = repository;
    }

    @RequestMapping("lyrics/search/{trackId}")
    public Lyrics search(@PathVariable("trackId") UUID trackId) {
        Lyrics cached = repository.findLyricsByTrackId(trackId);

        if (cached != null) {
            return cached;
        }

        Lyrics fetched = api.searchLyrics(trackId);

        repository.save(fetched);

        return fetched;
    }
}
