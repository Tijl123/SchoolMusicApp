package be.thomasmore.MusicEdgeService.controllers;

import be.thomasmore.MusicEdgeService.models.GenericResponseWrapper;
import be.thomasmore.MusicEdgeService.models.Track;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
                "http://track-service/tracks/search/findTrackByName?name=" + trackName, GenericResponseWrapper.class);

        List<Track> tracks = objectMapper.convertValue(wrapper.get_embedded().get("tracks"), new TypeReference<List<Track>>() {});

        return tracks;

    }
}
