package com.tradebox.model.repositories;

import com.tradebox.model.entities.Course;
import com.tradebox.model.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
