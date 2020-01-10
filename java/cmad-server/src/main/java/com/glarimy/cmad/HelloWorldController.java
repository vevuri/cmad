package com.glarimy.cmad;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ResponseEntity<Hello> hello() {
		Hello hello = new Hello();
		hello.setMessage("Hello World");
		return new ResponseEntity<Hello>(hello, HttpStatus.OK);
	}
}
