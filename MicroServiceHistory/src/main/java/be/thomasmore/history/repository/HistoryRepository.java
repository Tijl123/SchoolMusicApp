package be.thomasmore.history.repository;

import be.thomasmore.history.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface HistoryRepository extends JpaRepository<History, Integer> {
    History findHistoryByHistoryId(@Param("historyId") int historyId);
}

