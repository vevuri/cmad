package com.glarimy.cmad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class QuizController {

	@Autowired
	private QuizRepository repo;

	@RequestMapping(path = "/question", method = RequestMethod.POST)
	public ResponseEntity<Question> add(@RequestBody Question question) {
		repo.save(question);
		return new ResponseEntity<Question>(question, HttpStatus.CREATED);
	}

	@RequestMapping(path = "/questions", method = RequestMethod.GET)
	public ResponseEntity<List<Question>> search(@RequestParam("subject") String subject,
			@RequestParam("level") int level) {
		Page<Question> questions = repo.findBySubjectAndLevel(subject, level, new PageRequest(1, 3));
		System.out.println(questions);
		return new ResponseEntity<List<Question>>(questions.getContent(), HttpStatus.OK);
	}

	@RequestMapping(path = "/answers", method = RequestMethod.POST)
	public ResponseEntity<Long> search(@RequestBody List<Answer> answers) {
		Long count = 0L;
		for (Answer answer : answers) {
			count += repo.countByQidAndAnswer(answer.getQid(), answer.getOption());
		}
		return new ResponseEntity<Long>(count, HttpStatus.OK);
	}
}
