CREATE TABLE checkins
(
    id           INTEGER      NOT NULL PRIMARY KEY auto_increment,
    attendeers_id VARCHAR(255) not null,
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT checkins_attendeers_id_fkey FOREIGN KEY (attendeers_id)
    REFERENCES attendeers(attendeers_id)
);