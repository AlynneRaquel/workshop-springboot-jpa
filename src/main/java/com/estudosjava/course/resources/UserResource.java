package com.estudosjava.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudosjava.course.entities.User;

@RestController //indica que é o controller
@RequestMapping(value = "/users") //mapeia
public class UserResource {
	
	@GetMapping //metodo mapeado
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Maria", "maria@gmail.com", "87999914185", "12345");
		return ResponseEntity.ok().body(user);
	}
	
}
