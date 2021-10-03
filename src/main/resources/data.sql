insert into APARTMENT (APARTMENT_ID, DATE_ADDED, DESCRIPTION, FLOOR_AREA_SIZE, LATITUDE, LONGITUDE, NAME, NUMBER_OF_ROOMS, PRICE_PER_MONTH, REALTOR_ID, STATUS) 
values(1, '2021-9-21', 'Fully furnished flat with all amenties',800,17.3698,78.3913,'Fort View Apartment',4,500,2,'Available');

insert into APARTMENT (DATE_ADDED, DESCRIPTION, FLOOR_AREA_SIZE, LATITUDE, LONGITUDE, NAME, NUMBER_OF_ROOMS, PRICE_PER_MONTH, REALTOR_ID, STATUS) 
values(CURRENT_TIMESTAMP(), 'Premium luxury apartment with all amenties and greenary around the community',1200,17.3933,78.3411,'Rajpushpa Atria',3,1000,3,'Available');

insert into APARTMENT (DATE_ADDED, DESCRIPTION, FLOOR_AREA_SIZE, LATITUDE, LONGITUDE, NAME, NUMBER_OF_ROOMS, PRICE_PER_MONTH, REALTOR_ID, STATUS) 
values(CURRENT_TIMESTAMP(), 'Premium 25 store building with good people and great community for peaceful living',1550,17.395118508949913,78.34873679363898,'7 Hills PWS',4,1500,2,'Rented');

insert into APARTMENT (DATE_ADDED, DESCRIPTION, FLOOR_AREA_SIZE, LATITUDE, LONGITUDE, NAME, NUMBER_OF_ROOMS, PRICE_PER_MONTH, REALTOR_ID, STATUS) 
values(CURRENT_TIMESTAMP(), 'Economy flat with semi furnished with for peaceful living',1850,17.375931032221697,78.36610078811646,'Accurate Homes',1,2000,3,'Available');

insert into APARTMENT (DATE_ADDED, DESCRIPTION, FLOOR_AREA_SIZE, LATITUDE, LONGITUDE, NAME, NUMBER_OF_ROOMS, PRICE_PER_MONTH, REALTOR_ID, STATUS) 
values(CURRENT_TIMESTAMP(), 'Premium luxury 40 store building with great amenties',2150,17.387828636551163,78.3489990234375,'NCC Urban',3,2500,3,'Rented');

insert into APARTMENT (DATE_ADDED, DESCRIPTION, FLOOR_AREA_SIZE, LATITUDE, LONGITUDE, NAME, NUMBER_OF_ROOMS, PRICE_PER_MONTH, REALTOR_ID, STATUS) 
values(CURRENT_TIMESTAMP(), 'Simply nice flat for peaceful living with good amenties',2450,17.4141,78.5791,'Sri laxmi homes',2,3000,2,'Rented');

INSERT INTO USER (USER_ID, ROLE, FIRST_NAME, LAST_NAME, PHONE_NUMBER, EMAIL, PASSWORD)
values(1, 'Admin', 'Ambadas', 'Kota', '9866643282', 'admin@gmail.com', 'MTIzNDU2Nzg=');

INSERT INTO USER (ROLE, FIRST_NAME, LAST_NAME, PHONE_NUMBER, EMAIL, PASSWORD)
values('Realtor', 'Kiran', 'Kranthi', '9855543282', 'realtor@gmail.com', 'MTIzNDU2Nzg=');

INSERT INTO USER (ROLE, FIRST_NAME, LAST_NAME, PHONE_NUMBER, EMAIL, PASSWORD)
values('Realtor', 'Sheshu', 'Reddy', '9466343282', 'sheshu.reddy@gmail.com', 'MTIzNDU2Nzg=');

INSERT INTO USER (ROLE, FIRST_NAME, LAST_NAME, PHONE_NUMBER, EMAIL, PASSWORD)
values('Client', 'Anitha', 'Kota', '7702456123', 'client@gmail.com', 'MTIzNDU2Nzg=');

INSERT INTO USER (ROLE, FIRST_NAME, LAST_NAME, PHONE_NUMBER, EMAIL, PASSWORD)
values('Client', 'Alok', 'Kota', '8802456123', 'alok.kota@gmail.com', 'MTIzNDU2Nzg=');

INSERT INTO USER (ROLE, FIRST_NAME, LAST_NAME, PHONE_NUMBER, EMAIL, PASSWORD)
values('Client', 'Akarsh', 'Kota', '9802456123', 'akarsh.kota@gmail.com', 'MTIzNDU2Nzg=');