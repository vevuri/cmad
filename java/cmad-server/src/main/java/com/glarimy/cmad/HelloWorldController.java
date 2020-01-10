package com.glarimy.cmad;

//import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloWorldController {
	@Autowired
	private HelloRepository repo;

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ResponseEntity<Hello> hello() {
		Hello hello = repo.findAll().get(0);
		return new ResponseEntity<Hello>(hello, HttpStatus.OK);
	}
}
