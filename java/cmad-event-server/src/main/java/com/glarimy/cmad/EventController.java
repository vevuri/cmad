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
public class EventController {

	@Autowired
	private EventRepository repo;

	@RequestMapping(path = "/event", method = RequestMethod.POST)
	public ResponseEntity<Event> add(@RequestBody Event Event) {
		repo.save(Event);
		return new ResponseEntity<Event>(Event, HttpStatus.CREATED);
	}

	@RequestMapping(path = "/events", method = RequestMethod.GET)
	public ResponseEntity<List<Event>> list() {
		List<Event> events = repo.findAll();
		return new ResponseEntity<List<Event>>(events, HttpStatus.OK);
	}

}
