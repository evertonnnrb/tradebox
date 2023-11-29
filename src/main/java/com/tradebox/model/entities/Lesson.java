package com.tradebox.model.entities;


import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_lesson")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public abstract class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer position;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @ManyToMany
    @JoinTable(name = "tb_lessons_done",
            joinColumns = @JoinColumn(name = "lesson_id"),
            inverseJoinColumns = {
                    @JoinColumn(name = "user_id"),
                    @JoinColumn(name = "offer_id")
            })
    @Setter(AccessLevel.NONE)
    private Set<Enrollment> enrollmentsDone = new HashSet<>();

    public Lesson(Long id, String title, Integer position, Section section) {
        this.id = id;
        this.title = title;
        this.position = position;
        this.section = section;
    }
}
