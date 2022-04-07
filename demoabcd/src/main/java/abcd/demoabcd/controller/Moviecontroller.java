package abcd.demoabcd.controller;
import abcd.demoabcd.repository.MoviesRepository;
import abcd.demoabcd.tables.Movies;
import abcd.demoabcd.tables.Shows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Moviecontroller {

    @Autowired
    private MoviesRepository moviesRepository;

    @PostMapping("/Movie")
    @ResponseStatus(HttpStatus.CREATED)
    public Movies addDetails(
            @RequestBody Movies movies
    )
    {
        return moviesRepository.save(movies);
    }
    @GetMapping("/Movie")
    public List<Movies> getentries()
    {
        return moviesRepository.findAll();
    }
}
