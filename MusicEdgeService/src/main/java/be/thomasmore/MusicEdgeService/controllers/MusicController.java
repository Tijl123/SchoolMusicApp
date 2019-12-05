package be.thomasmore.MusicEdgeService.controllers;

import be.thomasmore.MusicEdgeService.models.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/track/{trackName}")
    public List<Track> getTracksByName(@PathVariable("trackName") String trackName){
        SearchResult wrapper= restTemplate.getForObject(
                "http://search-service/search?track=" + trackName, SearchResult.class);

        List<Track> tracks = objectMapper.convertValue(wrapper.getTracks(), new TypeReference<List<Track>>() {});

        return tracks;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/trackId/{trackId}")
    public Track getTrackByTrackId(@PathVariable("trackId") UUID trackId){
        Track track = restTemplate.getForObject(
                "http://search-service/track/id/" + trackId, Track.class);

        return track;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/album/{title}")
    public List<Album> getAlbumByTitle(@PathVariable("title") String title){
        SearchResult wrapper= restTemplate.getForObject(
                "http://search-service/search?album=" + title, SearchResult.class);

        List<Album> albums = objectMapper.convertValue(wrapper.getAlbums(), new TypeReference<List<Album>>() {});

        return albums;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/albumId/{albumId}")
    public Album getAlbumByAlbumId(@PathVariable("albumId") UUID albumId){
        Album album = restTemplate.getForObject(
                "http://search-service/album/id/" + albumId, Album.class);

        return album;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/artist/{name}")
    public List<Artist> getArtistByName(@PathVariable("name") String name){
        SearchResult wrapper= restTemplate.getForObject(
                "http://search-service/search?artist=" + name, SearchResult.class);

        List<Artist> artists = objectMapper.convertValue(wrapper.getArtists(), new TypeReference<List<Artist>>() {});

        return artists;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/artistId/{artistId}")
    public Artist getArtistByArtistId(@PathVariable("artistId") UUID artistId){
        Artist artist = restTemplate.getForObject(
                "http://search-service/artist/id/" + artistId, Artist.class);

        return artist;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/lyrics/{trackId}")
    public Lyrics getLyricsByTrackId(@PathVariable("trackId") UUID trackId){
        Lyrics lyrics = restTemplate.getForObject(
                "http://lyrics-service/lyrics/trackId/" + trackId, Lyrics.class);

        return lyrics;
    }

}
