package com.tradebox.model.entities;

import com.tradebox.model.enums.ResourceType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_resources")
@Data
@EqualsAndHashCode(of = "id")
public class Resource {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Integer position;

    @Column(columnDefinition = "TEXT")
    private String imgUri;

    private ResourceType type;

    private String externalLink;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @OneToMany(mappedBy = "resource")
    private Set<Section> sections = new HashSet<>();
}
