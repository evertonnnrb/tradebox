package com.tradebox.model.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_offers")
@Data
@EqualsAndHashCode(of = "id")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String edition;
    private Instant startMoment;
    private Instant endtMoment;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "offer")
    private List<Resource> resources = new ArrayList<>();

}
