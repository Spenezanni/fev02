package br.com.fev02.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.fev02.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {
	
	@Value("${forum.jwt.expiration}")
	private String expiration;
	
	@Value("${forum.jwt.secret}")
	private String secret;

	public String gerarToken(Authentication authentication) {
		
		User userLogado = (User) authentication.getPrincipal();
		Date current   = new Date(); 
		Date dateExpiration = new Date(current.getTime() + Long.parseLong(expiration)); 
		
		return Jwts.builder()
				.setIssuer("API fev02")
				.setSubject(userLogado.getId().toString())
				.setIssuedAt(current)
				.setExpiration(dateExpiration)
				.signWith(SignatureAlgorithm.HS256, secret)
				.compact();
	}

}
