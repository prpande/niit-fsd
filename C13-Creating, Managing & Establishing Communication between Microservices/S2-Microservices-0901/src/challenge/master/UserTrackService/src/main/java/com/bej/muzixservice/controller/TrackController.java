package com.bej.muzixservice.controller;

import com.bej.muzixservice.domain.Track;
import com.bej.muzixservice.domain.User;
import com.bej.muzixservice.exception.TrackAlreadyExistsException;
import com.bej.muzixservice.exception.TrackNotFoundException;
import com.bej.muzixservice.exception.UserAlreadyExistsException;
import com.bej.muzixservice.service.TrackServiceImpl;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("api/v2")
public class TrackController {
    // Auto wire the service layer object

    @PostMapping("register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        // Register a new user and save to db, return 201 status if user is saved else 500 status
        return null;
    }

    @PostMapping("user/track")
    public ResponseEntity<?> saveTrack(@RequestBody Track track, HttpServletRequest request) {
       // add a track to a specific user, return 201 status if track is saved else 500 status
        return null;
    }

    @GetMapping("user/tracks")
    public ResponseEntity<?> getAllTracks(HttpServletRequest request) {
        // display all the tracks of a specific user, extract user id from claims,
        // return 200 status if user is saved else 500 status
        return null;
    }

    @DeleteMapping("user/track/{trackId}")
    public ResponseEntity<?> deleteTrack(@PathVariable String trackId,HttpServletRequest request) throws TrackNotFoundException {
        // delete a track based on user id and track id, extract user id from claims
        // return 200 status if user is saved else 500 status
        return null;
    }

    @PutMapping("user/track")
    public ResponseEntity<?> updateTrack(@RequestBody Track track, HttpServletRequest request){
        // update a track based on user id and track id, extract user id from claims
        // return 200 status if user is saved else 500 status
       return null;
    }

}
