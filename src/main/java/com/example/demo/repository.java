package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface repository extends CrudRepository<radnikUser, Long> {
	radnikUser findById(int id);
	

}
