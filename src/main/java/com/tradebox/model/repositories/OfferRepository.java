package com.tradebox.model.repositories;

import com.tradebox.model.entities.Notification;
import com.tradebox.model.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
