package com.example.demo;

import org.springframework.data.repository.CrudRepository;


public interface repository extends CrudRepository<radnikUser, Long> {
	radnikUser findById(int id);
	

}
