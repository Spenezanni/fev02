package br.com.fev02.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fev02.form.LoginForm;
import br.com.fev02.security.TokenService;


@RestController
@RequestMapping("/auth")
public class AutenticacaoController {
	
	@Autowired
	private AuthenticationManager authManager;
	
	
	@Autowired
	private TokenService tokenService;
	
	@PostMapping
	public ResponseEntity<?> autenticar(@RequestBody LoginForm loginForm){
		
		UsernamePasswordAuthenticationToken authLogin = loginForm.converter(); 
		
		try {
			Authentication authentication = authManager.authenticate(authLogin);
			String token = tokenService.gerarToken(authentication);
			return ResponseEntity.ok().build();
			
		} catch (AuthenticationException e) {
			return ResponseEntity.badRequest().build();
		}
	}
	

}
