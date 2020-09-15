package com.yroots.ems.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventPayload {
	private String name;
	private LocalDate date;
	private LocalTime time;
	private String place;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
