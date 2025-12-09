package com.ipintelligence.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipintelligence.dto.AuthRequest;
import com.ipintelligence.dto.AuthResponse;
import com.ipintelligence.dto.RegisterRequest;
import com.ipintelligence.logicServices.UserServices;
import com.ipintelligence.model.User;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	UserServices userServices;
	
	 @PostMapping("/register")
	 public User register( @RequestBody User user) {
	        return this.userServices.createUser(user);
	 }
	 
	 @GetMapping("/login")
	 public String loging(Principal principal) {
		 String username=principal.getName();
		 User user= this.userServices.getUserByEmail(username);
		 return "✅ access granted! "+" "+user.getRole();
	 }
	 
	 
	 
	 
	 @GetMapping("/id")
	 public User getUserbyid(@PathVariable int id) {
		return  this.userServices.getUserById(id);
	 }
	 
	 
	 @GetMapping
	 public List<User> getalluser(){
		 return this.userServices.getAllUsers();
	 }
	 
	 
	

}
