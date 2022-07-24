package com.gl.javafsd.employeemanagement.config;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gl.javafsd.employeemanagement.model.LoginRequestModel;
import com.gl.javafsd.employeemanagement.model.User;
import com.gl.javafsd.employeemanagement.service.UserService;
import com.gl.javafsd.employeemanagement.serviceImpl.CustomUserDetailsService;
import com.gl.javafsd.employeemanagement.serviceImpl.UserServiceImpl;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter{
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
   @Autowired
	public AuthenticationFilter(UserService userService2) {
		this.userService = userService2;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		 try {
	            LoginRequestModel credentials = new ObjectMapper()
	                    .readValue(request.getInputStream(), LoginRequestModel.class);
	            return getAuthenticationManager().authenticate(
	                    new UsernamePasswordAuthenticationToken(credentials.getUsername(),
	                            credentials.getPassword(),
	                            new ArrayList<>())
	            );
	            
		 } catch (IOException e) {
	            e.printStackTrace();
	            throw new RuntimeException();
		 }
	}
	
	 @Override
	    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
	       System.out.println(((org.springframework.security.core.userdetails.User) authResult.getPrincipal()).getUsername());
	       String username = ((org.springframework.security.core.userdetails.User) authResult.getPrincipal()).getUsername();
//	       ((User) authResult.getPrincipal()).getUsername();
//	        User userDetails = userService.getUserDetails(username);
//	        System.out.println(userDetails);
	        
	    }
	
	

}
