package com.bej.authentication.security;


import com.bej.authentication.domain.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JWTSecurityTokenGeneratorImpl implements SecurityTokenGenerator {
    public static final String SECURITY_KEY = "UserSecurityKey";

    public String createToken(User user) {
        // Write logic to create the Jwt
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", user.getUserId());

        return generateToken(claims, user.getUserId());
    }

    public String generateToken(Map<String, Object> claims, String subject) {
        // Generate the token and set the user id in the claims
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, SECURITY_KEY)
                .compact();
    }
}