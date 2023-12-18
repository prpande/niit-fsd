package com.emusic.TrackApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Track {
    @Id
    private int trackId;
    private String trackName;
    private String trackArtist;
    private double trackRating;
    private String trackComments;

    public Track() {
    }

    public Track(int trackId, String trackName, String trackArtist, double trackRating, String trackComments) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackArtist = trackArtist;
        this.trackRating = trackRating;
        this.trackComments = trackComments;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    public double getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(double trackRating) {
        this.trackRating = trackRating;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", trackArtist='" + trackArtist + '\'' +
                ", trackRating=" + trackRating +
                ", trackComments='" + trackComments + '\'' +
                '}';
    }
}
