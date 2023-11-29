package com.tradebox.model.repositories;

import com.tradebox.model.entities.Course;
import com.tradebox.model.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
