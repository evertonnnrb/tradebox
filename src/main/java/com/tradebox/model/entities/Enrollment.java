package com.tradebox.model.entities;

import com.tradebox.model.pk.EnrollmentPK;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_enrollments")
@Data
public class Enrollment {


    @EmbeddedId
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private EnrollmentPK id = new EnrollmentPK();

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollMoment;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;

    private boolean available;

    private boolean onlyUpdate;

    @ManyToMany(mappedBy = "enrollmentsDone")
    private Set<Lesson> lessonsDone = new HashSet<>();

    public Enrollment(User user, Offer offer, Instant enrollMoment,
                      Instant refundMoment, boolean available, boolean onlyUpdate) {
        id.setUser(user);
        id.setOffer(offer);
        this.enrollMoment = enrollMoment;
        this.refundMoment = refundMoment;
        this.available = available;
        this.onlyUpdate = onlyUpdate;
    }

    public User getUser() {
        return id.getUser();
    }

    public void setUser(User user) {
        id.setUser(user);
    }

    public Offer setOffer() {
        return id.getOffer();
    }

    public void setOffer(Offer offer) {
        id.setOffer(offer);
    }

}
