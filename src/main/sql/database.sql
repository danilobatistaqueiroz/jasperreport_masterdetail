create table Persons (
   id int primary key,
   name varchar(30),
   city varchar(30) );

insert into PERSONS values(1, 'ETHAN', 'NEW YORK');
insert into PERSONS values(2, 'CALEB', 'SAN FRANCISCO');
insert into PERSONS values(3, 'WILLIAM', 'LONDON');
          
create table Email_Addresses (
   id int primary key,
   id_person varchar(30),
   email varchar(100) );

insert into EMAIL_ADDRESSES values(1, 1, 'ethan@yahoo.com');
insert into EMAIL_ADDRESSES values(2, 1, 'ethan@gmail.com');
insert into EMAIL_ADDRESSES values(3, 2, 'caleb@yahoo.com');
insert into EMAIL_ADDRESSES values(4, 2, 'caleb2@linux.com');
insert into EMAIL_ADDRESSES values(5, 2, 'cccleb@jaspersoft.com');
insert into EMAIL_ADDRESSES values(6, 3, 'wlm@somedomain.co.uk');
insert into EMAIL_ADDRESSES values(7, 3, 'william@someemail.eu');
insert into EMAIL_ADDRESSES values(8, 3, 'willy@myemail.org');
   
create table Phone_Numbers (
   id int primary key,
   id_person varchar(30),
   phone varchar(100) );
   
insert into PHONE_NUMBERS values(1, 1, '1(111) 111-1111');
insert into PHONE_NUMBERS values(2, 1, '1(222) 222-2222');
insert into PHONE_NUMBERS values(3, 1, '1(333) 333-3333');
insert into PHONE_NUMBERS values(4, 2, '1(444) 444-4444');
insert into PHONE_NUMBERS values(5, 3, '1(555) 555-5555');
insert into PHONE_NUMBERS values(6, 3, '1(666) 666-6666');


