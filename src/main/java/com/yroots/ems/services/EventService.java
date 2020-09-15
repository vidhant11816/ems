package com.yroots.ems.services;

import java.util.List;

import com.yroots.ems.domains.Event;
import com.yroots.ems.dtos.EventPayload;

public interface EventService {

	Event getOneEvent(Long id);
	Event createAnEvent(EventPayload payload);
	void deleteOne(Long id);
	List<Event> getAllEvents();
	
}
