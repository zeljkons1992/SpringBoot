package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
public class restController {
	
	private repository Repository;
	
    public restController(repository repository) {
        Repository = repository;
    }
	
    @GetMapping("/getUser")
    public List<radnikUser> getRadnik() {
    	return (List<radnikUser>) Repository.findAll();
    }

}
