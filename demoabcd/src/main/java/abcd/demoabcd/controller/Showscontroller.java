package abcd.demoabcd.controller;
import abcd.demoabcd.repository.ShowsRepository;
import abcd.demoabcd.tables.Shows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Showscontroller {

    @Autowired
    private ShowsRepository showsRepository;

    @PostMapping("/Shows")
    @ResponseStatus(HttpStatus.CREATED)
    public Shows addDetails(
            @RequestBody Shows shows
    )
    {
        return showsRepository.save(shows);
    }
    @GetMapping("/Shows")
    public List<Shows> getentries()
    {
        return showsRepository.findAll();
    }
}
