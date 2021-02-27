package com.conference.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conference.scheduler.entity.Conference;

public interface ConferenceRepository extends JpaRepository<Conference, String>{
	

}
