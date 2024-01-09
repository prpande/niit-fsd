package com.bej.customer.service;

import com.bej.customer.domain.Customer;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Service
public class JwtSecurityTokenGeneratorImpl implements SecurityTokenGenerator {
    public static final String SECRET_KEY = "CustomerSecretKey";

    //This method will generate the token
    @Override
    public Map<String, String> generateToken(Customer customer) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("customerId", customer.getCustomerId());
        claims.put("customerName", customer.getCustomerName());

        Map<String, String> map = new HashMap<>();
        map.put("token", createToken(claims, customer.getCustomerName()));
        map.put("message", "User Successfully logged in");
        return map;
    }

    public String createToken(Map<String, Object> claims, String subject) {
        return Jwts.builder()
                .setSubject(subject)
                .setClaims(claims)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}
