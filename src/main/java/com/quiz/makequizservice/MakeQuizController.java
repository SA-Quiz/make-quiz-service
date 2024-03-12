package com.quiz.makequizservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MakeQuizController {

	@CrossOrigin
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}