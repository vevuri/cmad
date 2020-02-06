package com.glarimy.cmad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private UserRepository repo;

	@RequestMapping(path = "/user", method = RequestMethod.POST)
	public ResponseEntity<User> add(@RequestBody User User) {
		repo.save(User);
		return new ResponseEntity<User>(User, HttpStatus.CREATED);
	}

	@RequestMapping(path = "/users", method = RequestMethod.GET)
	public ResponseEntity<List<User>> list() {
		List<User> Users = repo.findAll();
		return new ResponseEntity<List<User>>(Users, HttpStatus.OK);
	}

}
