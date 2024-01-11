package com.bej.muzixservice.repository;

import com.bej.muzixservice.domain.Track;
import com.bej.muzixservice.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserTrackRepository extends MongoRepository<User,String> {

}
