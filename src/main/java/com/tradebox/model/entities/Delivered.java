package com.tradebox.model.entities;

import com.tradebox.model.enums.DeliveredStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tb_delivered")
@Data
@EqualsAndHashCode(of = "id")
public class Delivered {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uri;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    @Enumerated
    private DeliveredStatus status;

    @Column(columnDefinition = "TEXT")
    private String feedBack;

    private Integer correctCount;

    @ManyToOne
    @JoinColumns(value = {
            @JoinColumn(name = "offer_id"),
            @JoinColumn(name = "user_id")
    })
    private Enrollment enrollment;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
}
