CREATE TABLE IF NOT EXISTS APARTMENT(
	APARTMENT_ID INTEGER NOT NULL AUTO_INCREMENT,
	DATE_ADDED DATE NOT NULL DEFAULT CURRENT_TIMESTAMP(),
	DESCRIPTION VARCHAR(256),
	FLOOR_AREA_SIZE INTEGER NOT NULL,
	LATITUDE DOUBLE,
	LONGITUDE DOUBLE,
	NAME VARCHAR(128) NOT NULL,
	NUMBER_OF_ROOMS INTEGER NOT NULL,
	PRICE_PER_MONTH DOUBLE,
	REALTOR_ID INTEGER NOT NULL,
	STATUS VARCHAR(16) NOT NULL DEFAULT 'Available',
	PRIMARY KEY(APARTMENT_ID));
	
CREATE TABLE IF NOT EXISTS USER(
	USER_ID INTEGER NOT NULL AUTO_INCREMENT,
	ROLE VARCHAR(8) NOT NULL,
	FIRST_NAME VARCHAR(128),
	LAST_NAME VARCHAR(128),
	PHONE_NUMBER VARCHAR(16),
	EMAIL VARCHAR(128) NOT NULL,
	PASSWORD VARCHAR(128),
	PRIMARY KEY(USER_ID),
	UNIQUE (EMAIL));