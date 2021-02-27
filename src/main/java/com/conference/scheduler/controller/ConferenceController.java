package com.conference.scheduler.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conference.scheduler.entity.Conference;
import com.conference.scheduler.model.ConferenceRequest;
import com.conference.scheduler.service.ConferenceService;

@RestController
@RequestMapping("/conference")
public class ConferenceController {
	
	@Autowired
	private ConferenceService conferenceService;
	
	@PostMapping("/save")
	public Conference save(@Valid @RequestBody ConferenceRequest request) {
		return conferenceService.saveConference(request);
	}
	
	@GetMapping("/getAll")
	public List<Conference> getAllConferences(){
		return conferenceService.getAllConferences();
	}
	
}
