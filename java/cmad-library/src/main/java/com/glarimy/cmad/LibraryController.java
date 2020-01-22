package com.glarimy.cmad;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LibraryController {

	@Autowired
	private BookRepository repo;

	@RequestMapping(path = "/book", method = RequestMethod.POST)
	public ResponseEntity<Book> add(@RequestBody Book book) {
		repo.save(book);
		return new ResponseEntity<Book>(book, HttpStatus.CREATED);
	}

	@RequestMapping(path = "/book/{isbn}", method = RequestMethod.GET)
	public ResponseEntity<Book> find(@PathVariable("isbn") String isbn) {
		Book book = repo.findOne(isbn);
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}

	@RequestMapping(path = "/book", method = RequestMethod.GET)
	public ResponseEntity<List<Book>> search(@RequestParam(name = "subject") String subject) {
		List<Book> books = repo.findBySubject(subject);
		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
	}
}
