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
    private final String ENCRYPTION_KEY = "UserKey";

    public String createToken(User user){
        // Write logic to create the Jwt
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", user.getUserId());

        return generateToken(claims, user.getUserId());
    }

    public String generateToken(Map<String,Object> claims,String subject) {
        // Generate the token and set the user id in the claims
        return Jwts.builder()
                .setSubject(subject)
                .setClaims(claims)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, ENCRYPTION_KEY)
                .compact();
    }


}
