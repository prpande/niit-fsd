package com.emusic.TrackApp.service;

import com.emusic.TrackApp.model.Track;

import java.util.List;

public interface ITrackService {
    Track saveTrack(Track track);
    List<Track> getAllTracks();
    Track getTrackById(int trackId);
    boolean deleteTrack(int trackId);
    List<Track> getTrackByArtist(String trackArtist);
    Track updateTrack(Track track, int trackId);
}
