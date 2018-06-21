package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@org.springframework.stereotype.Controller
public class Controller {

    private repository Repository;


    public Controller(repository repository) {
        Repository = repository;
    }
    @RequestMapping("/")
    public String getRadnik(Model model){

        model.addAttribute("radnici", Repository.findAll());

        return "index";
    }

    @PostMapping("/sacuvaj")
    public String save(@RequestParam( value ="ime") String ime, @RequestParam( value ="sifra") String sifra){
    	
    	radnikUser temp = new radnikUser();
    	temp.setName(ime);
    	temp.setPassword(sifra);
    	
    	Repository.save(temp);
    	
    	return "redirect:/";
    }
}
