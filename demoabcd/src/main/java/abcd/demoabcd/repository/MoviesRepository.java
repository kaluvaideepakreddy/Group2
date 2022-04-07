package abcd.demoabcd.repository;


import abcd.demoabcd.tables.Movies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MoviesRepository extends JpaRepository<Movies,Long> {


}
