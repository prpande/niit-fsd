package com.bej.authenticationservice.filter;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.web.filter.GenericFilterBean;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class JwtFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        String authHeader = httpServletRequest.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer")) {
            httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            PrintWriter pw = httpServletResponse.getWriter();
            pw.println("Missing or invalid Token ");
        } else {
            String jwtToken = authHeader.substring(7);
            Claims claims = Jwts.parser().setSigningKey("secretkey").parseClaimsJws(jwtToken).getBody();
            String username = Jwts.parser().setSigningKey("secretkey").parseClaimsJws(jwtToken).getBody().getSubject();
            httpServletRequest.setAttribute("username", username);
            filterChain.doFilter(servletRequest, servletResponse);

        }
    }
}
