package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(final String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Autowired
    AuthorRepository repo;

    @GetMapping("/{id}")
    public Author1 getAllPost(@PathVariable("id") final int id) {
        //return repo.findAll();
        final Optional<Author1> a = repo.findById(id);
        return a.get();
    }

}
