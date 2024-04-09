package com.quiz.makequizservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.quiz.makequizservice.MakeQuizController;

@SpringBootTest
class MakeQuizTest {
    @Test
    void makeQuiz() {
        MakeQuizController makeQuizController = new MakeQuizController();
        assert makeQuizController.makequiz().equals("Make a quiz");
    }
}
