package be.thomasmore.search.repository;

import be.thomasmore.search.entity.SearchResult;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SearchRepository extends MongoRepository<SearchResult, String> {

    SearchResult findByAlbumAndArtistAndTrack(String album, String artist, String track);
}
