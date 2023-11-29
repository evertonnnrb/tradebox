package com.tradebox.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
@EqualsAndHashCode(callSuper = true)
@Data
public class Content extends Lesson {
    @Column(columnDefinition = "TEXT")
    private String textContent;

    @Column(columnDefinition = "TEXT")
    private String videoUri;

}
