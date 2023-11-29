package com.tradebox.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tb_notifications")
@Data
@EqualsAndHashCode(of = "id")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    private boolean read;

    private String route;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public void setRead(boolean read) {
        this.read = false;
    }
}
