package be.thomasmore.lyrics.repository;

import be.thomasmore.lyrics.entity.Lyrics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.UUID;

@CrossOrigin
public interface LyricsRepository extends JpaRepository<Lyrics, Integer> {

    Lyrics findLyricsByTrackId(@Param("trackId") UUID trackId);

}

