package com.emusic.TrackApp.repository;

import com.emusic.TrackApp.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track, Integer> {
    List<Track> findByTrackArtist(String trackArtist);
}
