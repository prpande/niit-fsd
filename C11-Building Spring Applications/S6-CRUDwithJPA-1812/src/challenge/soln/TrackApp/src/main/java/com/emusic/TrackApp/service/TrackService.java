package com.emusic.TrackApp.service;

import com.emusic.TrackApp.model.Track;
import com.emusic.TrackApp.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackService implements ITrackService {

    private TrackRepository trackRepository;

    @Autowired
    public TrackService(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) {
        return trackRepository.save(track);
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public Track getTrackById(int trackId) {
        Optional<Track> foundTrack = trackRepository.findById(trackId);
        if (foundTrack.isEmpty()) {
            return null;
        }

        return foundTrack.get();
    }

    @Override
    public boolean deleteTrack(int trackId) {
        trackRepository.deleteById(trackId);
        return true;
    }

    @Override
    public List<Track> getTrackByArtist(String trackArtist) {
        return trackRepository.findByTrackArtist(trackArtist);
    }

    @Override
    public Track updateTrack(Track track, int trackId) {
        Optional<Track> foundTrack = trackRepository.findById(trackId);
        if (foundTrack.isEmpty()) {
            return null;
        }

        Track existingTrack = foundTrack.get();
        if (track.getTrackArtist() != null) {
            existingTrack.setTrackArtist(track.getTrackArtist());
        }

        if (track.getTrackName() != null) {
            existingTrack.setTrackName(track.getTrackName());
        }

        if (track.getTrackRating() > 0) {
            existingTrack.setTrackRating(track.getTrackRating());
        }

        if (track.getTrackComments() != null) {
            existingTrack.setTrackComments(track.getTrackComments());
        }

        return trackRepository.save(existingTrack);
    }
}
