create database renewableEnergies;
use renewableEnergies;

create table user(
	id int auto_increment primary key,
	usertype enum('basic','premium','admin') not null default 'basic',
    firstname varchar(20) not null,
    lastname varchar(20) not null,
	username varchar(20) not null unique,
    email varchar(20) not null unique,
	password varchar(20) not null
);

create table location(
	id int auto_increment primary key,
    name varchar(20) not null,
    year int not null
);

create table consumptionEnergy(
	id int auto_increment primary key,
    typeEnergy varchar(20) not null,
    value double not null,
    location int not null,
    foreign key (location) references location(id)
);

create table productionEnergy(
	id int auto_increment primary key,
    typeEnergy varchar(20) not null,
    value double not null,
    location int not null,
    foreign key (location) references location(id)
);