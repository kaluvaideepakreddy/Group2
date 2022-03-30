package com.example.Group2.Controller;

import com.example.Group2.Entity.Hello;
import com.example.Group2.Repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController
{
    @Autowired
    private HelloRepository helloRepository;

    @PostMapping("/Hello")
    @ResponseStatus(HttpStatus.CREATED)
    public Hello addDetails(
            @RequestBody Hello hello
    )
    {
        return helloRepository.save(hello);
    }
    @GetMapping("/Hello")
    public List<Hello> getentries()
    {
        return helloRepository.findAll();
    }

}
