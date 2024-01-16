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

import java.util.ArrayList;
import java.util.List;

@Service
public class TrackServiceImpl implements ITrackService{

    // Autowire the UserTrackRepository using constructor autowiring
    private UserTrackRepository userTrackRepository;

    @Autowired
    public TrackServiceImpl(UserTrackRepository userTrackRepository) {
        this.userTrackRepository = userTrackRepository;
    }

    @Override
    public User registerUser(User user) throws UserAlreadyExistsException {
        // Register a new user
        if(userTrackRepository.findById(user.getUserId()).isPresent()){
            throw new UserAlreadyExistsException();
        }

        return userTrackRepository.save(user);
    }

    @Override
    public User saveUserTrackToWishList(Track track, String userId) throws TrackAlreadyExistsException, UserNotFoundException {
        // Save the tracks to the play list of user.
        if (userTrackRepository.findById(userId).isEmpty()) {
            throw new UserNotFoundException();
        }

        User foundUser = userTrackRepository.findById(userId).get();
        List<Track> trackList = foundUser.getTrackList();

        if (trackList == null) {
            trackList = new ArrayList<>();
        } else {
            for (Track t : trackList) {
                if (t.getTrackId().equals(track.getTrackId())) {
                    throw new TrackAlreadyExistsException();
                }
            }
        }

        trackList.add(track);
        foundUser.setTrackList(trackList);
        return userTrackRepository.save(foundUser);
    }

    @Override
    public List<Track> getAllUserTracksFromWishList(String userId) throws Exception {
        // Get all the tracks for a specific user
        if (userTrackRepository.findById(userId).isEmpty()) {
            throw new UserNotFoundException();
        }

        return userTrackRepository.findById(userId).get().getTrackList();

    }

    @Override
    public User deleteTrack(String userId, String trackId) throws TrackNotFoundException, UserNotFoundException {
        // delete the user details specified
        if (userTrackRepository.findById(userId).isEmpty()) {
            throw new UserNotFoundException();
        }

        User foundUser = userTrackRepository.findById(userId).get();
        List<Track> trackList = foundUser.getTrackList();

        if (trackList == null) {
            throw new TrackNotFoundException();
        }

        Track foundTrack = null;
        for(Track t : trackList){
            if(t.getTrackId().equals(trackId)){
                foundTrack = t;
                break;
            }
        }

        if(foundTrack == null){
            throw new TrackNotFoundException();
        }

        trackList.remove(foundTrack);
        foundUser.setTrackList(trackList);
        return userTrackRepository.save(foundUser);
    }


    @Override
    public User updateUserTrackWishListWithGivenTrack(String userId, Track track) throws UserNotFoundException, TrackNotFoundException, TrackAlreadyExistsException {
        // Update the specific details of
        if (userTrackRepository.findById(userId).isEmpty()) {
            throw new UserNotFoundException();
        }

        User foundUser = userTrackRepository.findById(userId).get();
        List<Track> trackList = foundUser.getTrackList();

        if (trackList == null) {
            throw new TrackNotFoundException();
        }

        Track foundTrack = null;
        for(Track t : trackList){
            if(t.getTrackId().equals(track.getTrackId())){
                foundTrack = t;
                break;
            }
        }

        if (foundTrack == null) {
            throw new TrackNotFoundException();
        }
        if (foundTrack.equals(track)) {
            throw new TrackAlreadyExistsException();
        }

        trackList.remove(foundTrack);
        trackList.add(track);
        foundUser.setTrackList(trackList);
        return userTrackRepository.save(foundUser);
    }
}
