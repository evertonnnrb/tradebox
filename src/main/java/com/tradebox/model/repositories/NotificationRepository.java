package com.tradebox.model.repositories;

import com.tradebox.model.entities.Lesson;
import com.tradebox.model.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
