package com.quiz.makequizservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MakeQuizController {

	@CrossOrigin
	@GetMapping("/makequiz")
	public String makequiz() {
		return "Make a quiz";
	}

	@CrossOrigin
	@GetMapping("/getquiz")
	public String getquiz() {
		return "Get a quiz";
	}

	@CrossOrigin
	@GetMapping("/deletequiz")
	public String deletequiz() {
		return "Delete a quiz";
	}

	@CrossOrigin
	@GetMapping("/getquizzes")
	public String getquizzes() {
		return "Get quizzes";
	}

	@CrossOrigin
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}