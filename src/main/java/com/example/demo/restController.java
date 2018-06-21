package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class restController {
	
	private repository Repository;
	
    public restController(repository repository) {
        Repository = repository;
    }
	
    @GetMapping("/getUser")
    public radnikUser getRadnik() {
    	return Repository.findById(10);
    }

}
