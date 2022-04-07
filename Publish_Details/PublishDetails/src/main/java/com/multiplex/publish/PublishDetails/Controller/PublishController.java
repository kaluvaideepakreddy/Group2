package com.multiplex.publish.PublishDetails.Controller;

import com.multiplex.publish.PublishDetails.Validation.MovieValidator;
import com.multiplex.publish.PublishDetails.entity.Show;
import com.multiplex.publish.PublishDetails.entity.ShowType;
import com.multiplex.publish.PublishDetails.payload.GetMovie;
import com.multiplex.publish.PublishDetails.payload.PutMovie;
import com.multiplex.publish.PublishDetails.repository.ShowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collections;
@RestController
@RequestMapping("/api/publish")

public class PublishController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private ShowsRepository showsRepository;



    @PostMapping("/getmovie")

    public ResponseEntity<String> authenticateUser( @Valid @RequestBody GetMovie getMovie){
        Authentication authentication;
        authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                getMovie.getMovieName(), getMovie.getMovieId()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new ResponseEntity<>("Movie retrieved Successfully.", HttpStatus.OK);
    }


    @PostMapping("/putmovie")
    public ResponseEntity<?> registerUser (@Valid @RequestBody PutMovie putMovie){

        // add check for moviename exists in a DB
        if (showsRepository.existsByMovie(putMovie.getMovieName())) {
            return new ResponseEntity<>("Movie Name already exists", HttpStatus.BAD_REQUEST);
        }

        if (showsRepository.existsByMovieId(putMovie.getMovieId())) {
            return new ResponseEntity<>("Movie Id already exists", HttpStatus.BAD_REQUEST);
        }

        Show show = new Show();
        show.setMovieName(putMovie.getMovieName());
        show.setMovieId(putMovie.getMovieId());
        show.setShowType(ShowType.USER);
        showsRepository.save(show);

        return new ResponseEntity<>("Movie Added Successfully!!", HttpStatus.OK);
    }


}