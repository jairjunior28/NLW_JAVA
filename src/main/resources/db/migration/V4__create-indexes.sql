CREATE UNIQUE INDEX events_slug_key ON events(slug);
CREATE UNIQUE INDEX attendeers_events_id_email_key ON attendeers(attendeers_id,email);
CREATE UNIQUE INDEX checkins_id_key ON checkins(attendeers_id);