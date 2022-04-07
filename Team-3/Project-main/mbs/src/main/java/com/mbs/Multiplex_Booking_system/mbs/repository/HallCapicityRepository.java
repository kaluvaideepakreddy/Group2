package com.mbs.Multiplex_Booking_system.mbs.repository;

import com.mbs.Multiplex_Booking_system.mbs.entity.HallCapacity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallCapicityRepository extends JpaRepository<HallCapacity,Long> {

}
