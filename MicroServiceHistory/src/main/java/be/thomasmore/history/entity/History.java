package be.thomasmore.history.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="history")
@Data
@NoArgsConstructor
public class History {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="history")
    private String history;

    @Column(name="historyId")
    private int historyId;
}
