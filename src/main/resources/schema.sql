create database IF NOT EXISTS snnu_demo;
use  snnu_demo;
create table IF NOT EXISTS student(
    id varchar(255) not null ,
    name varchar(255) not null ,
    location varchar(255),
    birth_date timestamp,
    primary key(id)
);