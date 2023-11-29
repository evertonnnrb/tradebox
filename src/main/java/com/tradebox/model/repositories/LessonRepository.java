package com.tradebox.model.repositories;

import com.tradebox.model.entities.Course;
import com.tradebox.model.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
