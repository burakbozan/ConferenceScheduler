
CREATE DATABASE conference_scheduler;

USE conference_scheduler;

CREATE TABLE conference(

  -- The PK of the conference table
  id SERIAL PRIMARY KEY,

  -- The start time of the presentation
  start_time TIMESTAMP NOT NULL,

  -- The trackId of the presentation
  track_id INTEGER NOT NULL,

  -- The name of presentation
  title TEXT NOT NULL,
  
  -- The duration of the presentation, in minutes
  duration INTEGER NOT NULL
   
);
