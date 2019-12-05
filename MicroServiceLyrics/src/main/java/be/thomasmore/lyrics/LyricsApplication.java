package be.thomasmore.lyrics;

import be.thomasmore.lyrics.api.MusixMatch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class LyricsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LyricsApplication.class, args);
	}

	@Bean
	public MusixMatch getMusixMatch() {
		return new MusixMatch();
	}

}
