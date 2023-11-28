package com.tradebox.model.entities;

import com.tradebox.model.enums.ResourceType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "tb_sections")
@Data
@EqualsAndHashCode(of = "id")
public class Section {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private Integer position;

    @Column(columnDefinition = "TEXT")
    private String imgUri;

    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;

    @ManyToOne
    @JoinColumn(name = "prerequisite_id")
    private Section prerequisite;
}
