package com.Docker.docspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DocspringApplication 
{
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "This is a Docker testing file!"
				+ "Thanks for visiting us";
	}

	public static void main(String[] args) {
		SpringApplication.run(DocspringApplication.class, args);
	}

}
