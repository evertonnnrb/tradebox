package com.tradebox.model.repositories;

import com.tradebox.model.entities.Course;
import com.tradebox.model.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
