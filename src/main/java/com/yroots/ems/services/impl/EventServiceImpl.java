package com.yroots.ems.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yroots.ems.domains.Event;
import com.yroots.ems.dtos.EventPayload;
import com.yroots.ems.exceptions.ResourceNotFound;
import com.yroots.ems.repositories.EventRepository;
import com.yroots.ems.services.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepository eventRepository;

	@Override
	public Event getOneEvent(Long id) {
		Event event = eventRepository.findById(id).orElse(null);

		if (event == null)
			throw new ResourceNotFound("No resource with id " + id);

		return event;
	}

	@Override
	public Event createAnEvent(EventPayload payload) {

		Event event = new Event();
		event.setName(payload.getName());
		event.setDate(event.getDate());
		event.setTime(payload.getTime());
		event.setPlace(payload.getPlace());
		Event createdEvent = eventRepository.save(event);
		return createdEvent;
	}

	@Override
	public void deleteOne(Long id) {
		eventRepository.deleteById(id);
	}

	@Override
	public List<Event> getAllEvents() {
		return eventRepository.findAll();
	}

}
