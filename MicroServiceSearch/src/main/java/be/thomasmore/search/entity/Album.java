package be.thomasmore.search.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class Album {
    @Id
    private UUID id;
}
