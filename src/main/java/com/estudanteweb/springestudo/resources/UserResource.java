package com.estudanteweb.springestudo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudanteweb.springestudo.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1l, "lalala", "lalala@gmail.com", "444444", "123456789");
		return ResponseEntity.ok().body(u);
	}
}
