package be.thomasmore.lyrics.controller;

import be.thomasmore.lyrics.api.MusixMatch;
import be.thomasmore.lyrics.entity.Lyrics;
import be.thomasmore.lyrics.repository.LyricsRepository;
import org.springframework.web.bind.annotation.*;

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

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("lyrics/trackId/{trackId}")
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
