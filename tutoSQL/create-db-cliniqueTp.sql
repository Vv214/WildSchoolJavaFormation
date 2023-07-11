-- Active: 1688044672103@@127.0.0.1@3306

DROP DATABASE if EXISTS myRdv;

CREATE DATABASE if NOT EXISTS myRdv;

use myRdv;

CREATE TABLE
    IF NOT EXISTS user (
        id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
        name VARCHAR(255) NOT NULL,
        mail VARCHAR(255) NOT NULL,
        password VARCHAR(255) NOT NULL,
        phonenumber VARCHAR(255) NOT NULL,
        job VARCHAR(255) NOT NULL,
        created_at TIMESTAMP NOT NULL
    );

CREATE TABLE
    if NOT EXISTS doctor (
        id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
        user_id INT NOT NULL,
        speciality VARCHAR(255) NOT NULL,
        price INT NOT NULL,
        bio TEXT,
        FOREIGN KEY (user_id) REFERENCES user(id)
    );

CREATE TABLE
    if NOT EXists slot(
        id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
        date_appointment DATE NOT NULL,
        heure INT NOT NULL,
        aviable BOOLEAN
    );

CREATE TABLE
    if not exists appointment (
        id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
        doctor_id INT NOT NULL,
        slot_id INT NOT NULL,
        dateOfAppointement DATETIME NOT NULL,
        dateOfTaken DATETIME DEFAULT now() NOT NULL,
        duration int NOT NULL,
        room INT NOT NULL,
        Foreign Key (doctor_id) REFERENCES doctor(id),
        Foreign Key (slot_id) REFERENCES slot(id)
    );

Create Table
    if NOT EXISTS client(
        id int not NULL PRIMARY KEY AUTO_INCREMENT,
        appointement_id INT NOT NULL,
        user_id INT NOT NULL,
        FOREIGN KEY (user_id) REFERENCES user(id),
        Foreign Key (appointement_id) REFERENCES appointment(id)
    );

CREATE TABLE
    IF NOT EXISTS fk_clients_appointments(
        client_id int not NULL,
        appoint_id INT NOT NULL,
        Foreign Key (client_id) REFERENCES client(id),
        Foreign Key (appoint_id) REFERENCES appointment(id)
    );

INSERT INTO
    user(
        NAME,
        mail,
        PASSWORD,
        phonenumber,
        job,
        created_at
    )
VALUES (
        'USER1',
        'aa@aa.com',
        'toto',
        0102030405,
        'admin',
        NOW()
    ), (
        'Docteur Mes couilles sur ton frond',
        'aa@aa.com',
        'tata',
        0102030406,
        'doctor',
        now()
    ), (
        'Docteur Je suis le meilleur',
        'ca@aa.com',
        'tits',
        0104230406,
        'doctor',
        now()
    ), (
        'Mme tout le monde',
        'aa@aa.com',
        'tata',
        0102030604,
        'client',
        now()
    );

INSERT INTO
    doctor(user_id, speciality, price, bio)
VALUES (
        2,
        'FISTOLOGUE',
        250,
        'Ayant créé la fistinière j en ai fait ma spécialité'
    ), (
        3,
        'PRONCTOLOGUE',
        250,
        'Mon metier c est vraiment ma passion, j aime aller au fond des choses !!! '
    );

INSERT INTO
    slot(
        date_appointment,
        heure,
        aviable
    )
VALUES (now(), 1, true), (now(), 1, FALSE);

INSERT INTO
    appointment(
        doctor_id,
        slot_id,
        dateOfAppointement,
        dateOfTaken,
        duration,
        room
    )
VALUES (2, 1, now(), now(), 1, 4);

INSERT INTO client(user_id, appointement_id) VALUES(4,1);

SHOW TABLES;

SELECT * from client;

SELECT * from user;

SELECT * 