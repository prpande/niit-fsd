package com.bej.muzixservice.filter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtFilter extends GenericFilter {
    public static final String SECURITY_KEY = "UserSecurityKey";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String authHeader = request.getHeader("Authorization");
        // Parse and validate the token and set the user id from claims in the request header as an attribute.
        if (authHeader == null || !authHeader.startsWith("Bearer")) {
            throw new ServletException("Missing or invalid token");
        }

        String token = authHeader.substring(7);
        Claims claim = Jwts.parser().setSigningKey(SECURITY_KEY).parseClaimsJws(token).getBody();
        request.setAttribute("claims", claim);

        filterChain.doFilter(request, response);
    }
}

