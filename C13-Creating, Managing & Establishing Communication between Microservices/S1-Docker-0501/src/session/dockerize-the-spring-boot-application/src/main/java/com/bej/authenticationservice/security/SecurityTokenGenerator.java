package com.bej.authenticationservice.security;

import com.bej.authenticationservice.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator {
  Map<String,String> generateToken(User user);
}
