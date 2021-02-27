package com.conference.scheduler.service;

import java.util.List;

import com.conference.scheduler.entity.Conference;
import com.conference.scheduler.model.ConferenceRequest;

public interface ConferenceService {
	
	List<Conference> getAllConferences();
	
	Conference saveConference(ConferenceRequest conferenceRequest);
}
