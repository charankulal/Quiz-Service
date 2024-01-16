package com.charan.quizservice.service;

import com.charan.quizservice.dao.QuizDao;
import com.charan.quizservice.model.QuestionWrapper;
import com.charan.quizservice.model.Quiz;
import com.charan.quizservice.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;
//    @Autowired
//    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, Integer numQ, String title) {

        // Call the generate url from question service - Use of RestTemplate Url=>http://localhost:8080/question/generate
//        List<Integer> questions = ;
//        Quiz quiz = new Quiz();
//        quiz.setTitle(title);
//        quiz.setQuestions(questions);
//        quizDao.saveAndFlush(quiz);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
//        Optional<Quiz> quiz = quizDao.findById(id);
//        List<Question> questionsFromDB = quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUsers = new ArrayList<>();
//
//        for (Question q : questionsFromDB) {
//            QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
//            questionsForUsers.add(qw);
//        }

        return new ResponseEntity<>(questionsForUsers, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizDao.findById(id).get();
//        List<Question> questions = quiz.getQuestions();
        Integer right = 0;
        Integer i = 0;
//        for (Response response : responses) {
//            if (response.getResponse().equals(questions.get(i).getRightAnswer()))
//                right++;
//            i++;
//        }
        return new ResponseEntity<>(right, HttpStatus.OK);
    }
}
