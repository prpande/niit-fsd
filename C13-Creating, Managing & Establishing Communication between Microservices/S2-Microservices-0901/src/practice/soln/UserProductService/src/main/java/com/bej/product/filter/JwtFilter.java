package com.bej.product.filter;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class JwtFilter extends GenericFilter {
    private final String ENCRYPTION_KEY = "UserKey";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer")) {
            throw new ServletException("Missing or invalid token");
        }

        // Parse and validate the token and set the user id from claims in the request header as an attribute.
        String token = authHeader.substring(7);
        Claims claims = Jwts.parser().setSigningKey(ENCRYPTION_KEY).parseClaimsJwt(token).getBody();
        request.setAttribute("claims", claims);
        filterChain.doFilter(request, response);
    }
}

