package com.conference.scheduler.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conference.scheduler.entity.Conference;
import com.conference.scheduler.model.ConferenceRequest;
import com.conference.scheduler.repository.ConferenceRepository;
import com.conference.scheduler.service.ConferenceService;

@Service
public class ConferenceServiceImpl implements ConferenceService {

	@Autowired
	private ConferenceRepository conferenceRepository;

	@Override
	public List<Conference> getAllConferences() {
		return conferenceRepository.findAll().stream().collect(Collectors.toList());
	}

	@Override
	public Conference saveConference(final ConferenceRequest conferenceRequest) {

		Conference conference = Conference.builder().startTime(conferenceRequest.getStartTime())
				.trackId(conferenceRequest.getTrackId()).title(conferenceRequest.getTitle())
				.duration(conferenceRequest.getDuration()).build();

		return conferenceRepository.save(conference);

	}

}
