## WILDLIFE TRACKER
This is an application that allows Rangers to track wildlife sightings in the area and record status whether it is endangered or not endangered. 

# AUTHOR
* Gideon Okuro

# Prerequisites
You will need the following things properly installed on your computer.

* JRE
* JDK

# Installation
* git clone <https://github.com/Okuro3499/WildlifeTracker.git> this repository
* cd wildlife-tracker

# Running / Development
* gradle run

# Running Tests

* gradle test

# Building
* gradle build

# SQL
* Launch postgres
* Type in psql

(Run the following commands):
* CREATE DATABASE wildlife_tracker;
* \c wildlife_tracker;
* CREATE TABLE animals (id serial PRIMARY KEY, name varchar, status varchar, health varchar, age varchar);
* CREATE TABLE sightings (id serial PRIMARY KEY, location varchar, ranger varchar, timestamp sighting);
* CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;

# LICENSE
MIT License Copyright (c) [2020] [Gideon Okuro]