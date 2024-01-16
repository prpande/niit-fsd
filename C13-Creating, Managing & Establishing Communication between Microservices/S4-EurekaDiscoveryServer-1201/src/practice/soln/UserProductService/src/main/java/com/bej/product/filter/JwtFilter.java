package com.bej.product.filter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtFilter extends GenericFilter {
    private final String ENCRYPTION_KEY = "CustomerKey";
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        ServletOutputStream pw = response.getOutputStream();
        String authHeader = request.getHeader("Authorization");
        if (request.getMethod().equals("OPTIONS")) {
            response.setStatus(HttpServletResponse.SC_OK);
            filterChain.doFilter(request, response);
        } else if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            pw.println("Missing or Invalid Token");
        } else {
            String token = authHeader.substring(7);
            Claims claims = Jwts.parser().setSigningKey(ENCRYPTION_KEY).parseClaimsJws(token).getBody();
            request.setAttribute("claims", claims);
            filterChain.doFilter(request, response);
        }
    }
}

