package com.emusic.TrackApp.controller;

import com.emusic.TrackApp.model.Track;
import com.emusic.TrackApp.service.ITrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TrackController {

    private ITrackService trackService;

    @Autowired
    public TrackController(ITrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping("/tracks")
    public ResponseEntity getAllTracks(){
        return new ResponseEntity(trackService.getAllTracks(), HttpStatus.OK);
    }

    @PostMapping("/tracks")
    public ResponseEntity saveTrack(@RequestBody Track track){
        return new ResponseEntity(trackService.saveTrack(track), HttpStatus.CREATED);
    }

    @GetMapping("/tracks/{trackId}")
    public ResponseEntity getTrackById(@PathVariable int trackId){
        return new ResponseEntity(trackService.getTrackById(trackId), HttpStatus.FOUND);
    }

    @GetMapping("/tracks/trackArtist={trackArtist}")
    public ResponseEntity getTrackByArtist(@PathVariable String trackArtist){
        return new ResponseEntity(trackService.getTrackByArtist(trackArtist),HttpStatus.FOUND);
    }

    @PutMapping("/tracks/{trackId}")
    public ResponseEntity updateTrack(@RequestBody Track track, @PathVariable int trackId){
        return new ResponseEntity(trackService.updateTrack(track, trackId), HttpStatus.OK);
    }

    @DeleteMapping("/tracks/{trackId}")
    public ResponseEntity deleteTrack(@PathVariable int trackId){
        return new ResponseEntity(trackService.deleteTrack(trackId), HttpStatus.OK);
    }
}
