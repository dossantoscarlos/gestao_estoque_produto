CREATE TABLE IF NOT EXISTS users (
    id UUID  PRIMARY KEY NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    validate_email boolean default false
);