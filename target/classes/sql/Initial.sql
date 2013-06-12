create database if not exists demo;

use demo;

drop table if exists person;
drop table if exists visit;
drop table if exists vitals;

create table if not exists person(
	id MEDIUMINT NOT NULL AUTO_INCREMENT,
	dob datetime,
	first_name varchar(50),
	last_name varchar(50),
	middle_name varchar(30),
    ssn varchar(9),
    sex varchar(3),
	primary key (id)
);
create index names on person(first_name, middle_name, last_name);
create index ssns on person(ssn);

create table if not exists visit(
	id mediumint not null auto_increment,
	person_id mediumint,
	admit_date datetime,
    discharge_date datetime,
    diagnosis varchar(250),
	primary key (id)
);
create index visit_person on visit(person_id);
create index admits on visit(admit_date);

create table if not exists vitals(
	id mediumint not null auto_increment,
	visit_id mediumint,
	pulse double(3, 2),
    systolic_bp integer(3),
	diastolic_bp integer(3),
	primary key (id)
);
create index vitals_visit on vitals(visit_id);
create index bp on vitals(systolic_bp, diastolic_bp);
