//package com.example.ecommerce.security;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//import java.util.function.Function;
//
//@Component
//public class JWTUtil {
//
//    private static final String SECRET_KEY = "your_secret_key"; // Change this to a secure secret key
//
//    public String generateToken(UserDetails userDetails) {
//        return createToken(userDetails.getUsername());
//    }
//
//    private String createToken(String subject) {
//        Date now = new Date();
//        Date expirationDate = new Date(now.getTime() + 86400000); // Token expires in 1 day (adjust as needed)
//
//        return Jwts.builder()
//                .setSubject(subject)
//                .setIssuedAt(now)
//                .setExpiration(expirationDate)
//                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
//                .compact();
//    }
//
//    public boolean validateToken(String token) {
//        String username = extractUsername(token);
//        return (username != null && !isTokenExpired(token));
//    }
//
//    private boolean isTokenExpired(String token) {
//        Date expiration = extractExpiration(token);
//        return expiration != null && expiration.before(new Date());
//    }
//
//    public String extractUsername(String token) {
//        return extractClaim(token, Claims::getSubject);
//    }
//
//    private Date extractExpiration(String token) {
//        return extractClaim(token, Claims::getExpiration);
//    }
//
//    private <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
//        Claims claims = extractAllClaims(token);
//        return claimsResolver.apply(claims);
//    }
//
//    private Claims extractAllClaims(String token) {
//        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
//    }
//}
