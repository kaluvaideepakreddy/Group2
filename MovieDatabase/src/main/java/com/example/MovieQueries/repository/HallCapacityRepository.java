package com.example.MovieQueries.repository;


import com.example.MovieQueries.entity.HallCapacity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallCapacityRepository extends JpaRepository <HallCapacity,Long> {


}
