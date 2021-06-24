CREATE DATABASE project;
\c project;
CREATE TABLE users(
    id SERIAL,
    name varchar(50) NOT NULL,
    email varchar(50) NOT NULL,
    password varchar(50) NOT NULL,
    gender varchar(10),
    rating decimal(2,1),
    createdAt TIMESTAMP DEFAULT current_timestamp,
    PRIMARY KEY (id),
    UNIQUE (email)
);