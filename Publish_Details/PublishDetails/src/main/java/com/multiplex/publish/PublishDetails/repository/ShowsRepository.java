package com.multiplex.publish.PublishDetails.repository;

import com.multiplex.publish.PublishDetails.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ShowsRepository extends JpaRepository<Show,Long> {

    Optional<Show> findbyMovie(String MovieName);
    Optional<Show> findbyMovieId(Long MovieId);
    Boolean existsByMovie(String MovieName);
    Boolean existsByMovieId(Long MovieId);
}
