package be.thomasmore.search.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class Artist {
    private UUID id;
    private String name;
}
