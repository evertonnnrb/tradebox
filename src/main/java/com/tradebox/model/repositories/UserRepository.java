package com.tradebox.model.repositories;

import com.tradebox.model.entities.Course;
import com.tradebox.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
