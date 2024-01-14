package com.bej.muzixservice.controller;

import com.bej.muzixservice.domain.Track;
import com.bej.muzixservice.domain.User;
import com.bej.muzixservice.exception.TrackNotFoundException;
import com.bej.muzixservice.exception.UserAlreadyExistsException;
import com.bej.muzixservice.service.ITrackService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/v2")
public class TrackController {
    // Auto wire the service layer object
    private ITrackService trackService;
    private ResponseEntity<?> responseEntity;

    @Autowired
    public TrackController(ITrackService trackService) {
        this.trackService = trackService;
    }

    @PostMapping("register")
    public ResponseEntity<?> registerUser(@RequestBody User user) throws UserAlreadyExistsException {
        // Register a new user and save to db, return 201 status if user is saved else 500 status
        try {
            responseEntity = new ResponseEntity<>(trackService.registerUser(user), HttpStatus.CREATED);
        } catch (UserAlreadyExistsException ex) {
            throw ex;
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }
        return responseEntity;
    }

    @PostMapping("user/track")
    public ResponseEntity<?> saveTrack(@RequestBody Track track, HttpServletRequest request) {
        // add a track to a specific user, return 201 status if track is saved else 500 status
        try {
            responseEntity = new ResponseEntity<>(trackService.saveUserTrackToWishList(track, getUserIdFromClaims(request)), HttpStatus.CREATED);
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }
        return responseEntity;
    }

    @GetMapping("user/tracks")
    public ResponseEntity<?> getAllTracks(HttpServletRequest request) {
        // display all the tracks of a specific user, extract user id from claims,
        // return 200 status if user is saved else 500 status
        try {
            responseEntity = new ResponseEntity<>(trackService.getAllUserTracksFromWishList(getUserIdFromClaims(request)), HttpStatus.OK);
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }
        return responseEntity;
    }

    @DeleteMapping("user/track/{trackId}")
    public ResponseEntity<?> deleteTrack(@PathVariable String trackId, HttpServletRequest request) throws TrackNotFoundException {
        // delete a track based on user id and track id, extract user id from claims
        // return 200 status if user is saved else 500 status
        try {
            responseEntity = new ResponseEntity<>(trackService.deleteTrack(getUserIdFromClaims(request), trackId), HttpStatus.OK);
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }
        return responseEntity;
    }

    @PutMapping("user/track")
    public ResponseEntity<?> updateTrack(@RequestBody Track track, HttpServletRequest request) {
        // update a track based on user id and track id, extract user id from claims
        // return 200 status if user is saved else 500 status
        try {
            responseEntity = new ResponseEntity<>(trackService.updateUserTrackWishListWithGivenTrack(getUserIdFromClaims(request), track), HttpStatus.OK);
        } catch (Exception ex) {
            responseEntity = get500Response(ex);
        }
        return responseEntity;
    }

    private String getUserIdFromClaims(HttpServletRequest request) {
        Claims claims = (Claims) request.getAttribute("claims");
        return claims.getSubject();
    }

    private ResponseEntity<String> get500Response(Exception ex) {
        return new ResponseEntity<>(ex.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}