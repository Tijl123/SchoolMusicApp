package be.thomasmore.history.controller;

import be.thomasmore.history.entity.History;
import be.thomasmore.history.repository.HistoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class HistoryController {


    private final HistoryRepository repository;

    public HistoryController(HistoryRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("history/historyId/{historyId}")
    public History history(@PathVariable("historyId") UUID historyId) {

        History cached = repository.findHistoryByHistoryId(historyId);

        if (cached != null) {
            return cached;
        }

        repository.save(fetched);

        return fetched;
    }
}
