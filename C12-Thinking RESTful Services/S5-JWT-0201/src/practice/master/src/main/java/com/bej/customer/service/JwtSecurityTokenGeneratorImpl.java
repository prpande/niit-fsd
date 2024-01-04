package com.bej.customer.service;

import com.bej.customer.domain.Customer;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Service
public class JwtSecurityTokenGeneratorImpl implements SecurityTokenGenerator{

    //This method will generate the token

    @Override
    public Map<String, String> generateToken(Customer customer) {



       Map<String,String> map = new HashMap<>();

        return map;
    }
}
