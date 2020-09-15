package com.yroots.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yroots.ems.domains.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
