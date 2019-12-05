package be.thomasmore.MusicEdgeService.controllers;

import be.thomasmore.MusicEdgeService.models.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/track/{trackName}")
    public List<Track> getTracksByName(@PathVariable("trackName") String trackName){
        GenericResponseWrapper wrapper= restTemplate.getForObject(
                "http://search-service/search?track=" + trackName, GenericResponseWrapper.class);

        List<Track> tracks = objectMapper.convertValue(wrapper.get_embedded().get("tracks"), new TypeReference<List<Track>>() {});

        return tracks;
    }

    @GetMapping("/album/{title}")
    public List<Album> getAlbumByTitle(@PathVariable("title") String title){
        GenericResponseWrapper wrapper= restTemplate.getForObject(
                "http://search-service/search?album=" + title, GenericResponseWrapper.class);

        List<Album> albums = objectMapper.convertValue(wrapper.get_embedded().get("album"), new TypeReference<List<Album>>() {});

        return albums;

    }

    @GetMapping("/artist/{name}")
    public List<Artist> getArtistByName(@PathVariable("name") String name){
        GenericResponseWrapper wrapper= restTemplate.getForObject(
                "http://search-service/search?artist=" + name, GenericResponseWrapper.class);

        List<Artist> artists = objectMapper.convertValue(wrapper.get_embedded().get("artist"), new TypeReference<List<Artist>>() {});

        return artists;

    }

    @GetMapping("/lyrics/{trackId}")
    public Lyrics getLyricsByTrackId(@PathVariable("trackId") int trackId){
        Lyrics lyrics = restTemplate.getForObject(
                "http://lyrics-service/lyrics/trackId=" + trackId, Lyrics.class);

        return lyrics;

    }

}
