package com.bej.muzixservice.service;

import com.bej.muzixservice.domain.Track;
import com.bej.muzixservice.domain.User;
import com.bej.muzixservice.exception.TrackAlreadyExistsException;
import com.bej.muzixservice.exception.TrackNotFoundException;
import com.bej.muzixservice.exception.UserAlreadyExistsException;
import com.bej.muzixservice.exception.UserNotFoundException;

import com.bej.muzixservice.repository.UserTrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements ITrackService{

    // Autowire the UserTrackRepository using constructor autowiring

    @Override
    public User registerUser(User user) throws UserAlreadyExistsException {
        // Register a new user
       return null;
    }

    @Override
    public User saveUserTrackToWishList(Track track, String userId) throws TrackAlreadyExistsException, UserNotFoundException {
        // Save the tracks to the play list of user.
        return null;
    }

    @Override
    public List<Track> getAllUserTracksFromWishList(String userId) throws Exception {
        // Get all the tracks for a specific user
       return null;

    }

    @Override
    public User deleteTrack(String userId, String trackId) throws TrackNotFoundException, UserNotFoundException {
      // delete the user details specified
        return null;
    }


    @Override
    public User updateUserTrackWishListWithGivenTrack(String userId, Track track) throws UserNotFoundException, TrackNotFoundException, TrackAlreadyExistsException {
      // Update the specific details of
        return null;
    }
}
