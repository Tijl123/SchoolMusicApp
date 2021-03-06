package be.thomasmore.search;

import be.thomasmore.search.musicbrainz.MusicBrainzApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);
	}

	@Bean
	public MusicBrainzApi getMusicBrainzApi() {
		return new MusicBrainzApi();
	}
}
