package com.bej.authentication.security;


import com.bej.authentication.domain.Customer;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JWTSecurityTokenGeneratorImpl implements SecurityTokenGenerator {
    private final String ENCRYPTION_KEY = "CustomerKey";

    public String createToken(Customer customer){
        // Write logic to create the Jwt
        Map<String, Object> claims = new HashMap<>();
        claims.put("customerId", customer.getCustomerId());

        return generateToken(claims, String.valueOf(customer.getCustomerId()));
    }

    public String generateToken(Map<String,Object> claims,String subject) {
        // Generate the token and set the customer id in the claims
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, ENCRYPTION_KEY)
                .compact();
    }
}

