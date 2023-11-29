package com.tradebox.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "tb_task")
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Task extends Lesson{

    private String description;

    private Integer questionCount;

    private Integer aprovalCount;

    private Double weight;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dueDate;
}
