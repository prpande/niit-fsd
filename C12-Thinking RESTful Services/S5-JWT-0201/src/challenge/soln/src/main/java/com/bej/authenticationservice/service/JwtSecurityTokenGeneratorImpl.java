package com.bej.authenticationservice.service;

import com.bej.authenticationservice.domain.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtSecurityTokenGeneratorImpl implements SecurityTokenGenerator {

  //This method will generate the token
  public static final String SECURITY_KEY = "UserSecurityKey";

  @Override
  public Map<String, String> generateToken(User user) {

    Map<String, Object> claim = new HashMap<>();
    claim.put("userId", user.getUserId());
    claim.put("username", user.getUsername());

    Map<String, String> map = new HashMap<>();
    map.put("token", createToken(claim, user.getUsername()));
    map.put("message", "User Successfully logged in");
    return map;
  }

  public String createToken(Map<String, Object> claim, String subject) {
    return Jwts.builder()
            .setClaims(claim)
            .setSubject(subject)
            .setIssuedAt(new Date())
            .signWith(SignatureAlgorithm.HS256, SECURITY_KEY)
            .compact();
  }
}

