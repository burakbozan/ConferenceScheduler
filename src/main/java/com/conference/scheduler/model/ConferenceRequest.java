package com.conference.scheduler.model;

import java.time.ZonedDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class ConferenceRequest {

    @NotNull
    @DateTimeFormat(iso = ISO.DATE_TIME)
	private ZonedDateTime startTime;

    @NotNull
	private Integer trackId;

    @NotNull
	private String title;

	@NotNull
	@Positive
	private Integer duration;
	
	public ConferenceRequest(final ZonedDateTime startTime, final Integer trackId, final String title, final Integer duration) {
		
		this.startTime = startTime;
		this.trackId = trackId;
		this.title = title;
		this.duration = duration;
	}

}
