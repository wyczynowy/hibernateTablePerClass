create database vehiclesdb;

use vehiclesdb;

CREATE TABLE vehicles (
  id bigint NOT NULL,
  type varchar(45) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE cars (
  id bigint NOT NULL,
  type varchar(45) NOT NULL,
  brand_name varchar(45) NOT NULL,
  horse_power bigint NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE trucks (
  id bigint NOT NULL,
  type varchar(45) NOT NULL,
  brand_name varchar(45) NOT NULL,
  weight bigint NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;