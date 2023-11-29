package com.tradebox.model.repositories;

import com.tradebox.model.entities.Delivered;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliverRepository extends JpaRepository<Delivered, Long> {
}
