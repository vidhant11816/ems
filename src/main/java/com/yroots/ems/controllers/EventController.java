package com.yroots.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yroots.ems.domains.Event;
import com.yroots.ems.dtos.EventPayload;
import com.yroots.ems.services.EventService;

@RestController
@RequestMapping("/events")
public class EventController {

	@Autowired
	private EventService eventService;

	@PostMapping
	public Event createAnEvent(@RequestBody EventPayload payload) {
		return eventService.createAnEvent(payload);
	}

	@GetMapping("/{id}")
	public Event getOneEvent(@PathVariable(value = "id", required = true) Long id) {
		return eventService.getOneEvent(id);
	}

	@GetMapping
	public List<Event> getAllEvents() {
		return eventService.getAllEvents();
	}

	@DeleteMapping("/{id}")
	public void deleteOne(@PathVariable(value = "id", required = true) Long id) {
		eventService.deleteOne(id);
	}

}
