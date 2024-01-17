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
    @Override
    public String createToken(Customer customer) {

        // Write logic to create the Jwt
        return null;
        }

        public String generateToken(Map<String,Object> claims,String subject) {
            // Generate and return the token
            return null;

        }
    }

