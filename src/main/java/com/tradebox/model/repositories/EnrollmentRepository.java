package com.tradebox.model.repositories;

import com.tradebox.model.entities.Enrollment;
import com.tradebox.model.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
