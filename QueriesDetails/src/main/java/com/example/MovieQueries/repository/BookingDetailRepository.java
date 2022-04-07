package com.example.MovieQueries.repository;


import com.example.MovieQueries.entity.BookingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDetailRepository extends JpaRepository <BookingDetail,Long>{



}
