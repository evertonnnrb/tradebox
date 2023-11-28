package com.tradebox.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "tb_roles")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Role {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String authority;
}
