create table events(
                    id VARCHAR(255) NOT NULL PRIMARY KEY,
                    tittle VARCHAR(255) NOT NULL,
                    details VARCHAR(255) NOT NULL,
                    slug VARCHAR(255) NOT NULL ,
                    maximun_attendeers INTEGER NOT NULL
);