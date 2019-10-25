package be.thomasmore.lyrics.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Lyrics {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="lyrics")
    private String lyrics;

    @Column(name="trackId")
    private int trackId;
}
