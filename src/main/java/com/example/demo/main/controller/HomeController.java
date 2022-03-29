package com.example.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.main.model.Home;
import com.example.demo.main.repository.Springrepository;

@RestController
@RequestMapping("/api/data")
public class HomeController {
	
	@Autowired
	private Springrepository springrepo;
	
	@CrossOrigin(origins="http://localhost:3000/")
	@GetMapping("/get")
	public  List<Home> getusers() {
		System.out.println("hi world");
		return springrepo.findAll();
	}
	
	@PostMapping("/post")
	public void  postusers(@RequestBody Home user) {
		System.out.println("hi world");
		springrepo.save(user);
	}
	

}
