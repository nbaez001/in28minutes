insert into user_details(id,name,birth_date)
values(10001,'NERIO',current_date());
insert into user_details(id,name,birth_date)
values(10002,'RAVY',current_date());
insert into user_details(id,name,birth_date)
values(10003,'CESAR',current_date());

insert into post(id, description,user_id)
values(20001,'I want to learn AWS', 10001);
insert into post(id, description,user_id)
values(20002,'I want to learn Devops', 10001);
insert into post(id, description,user_id)
values(20003,'I want to be AWS Certified', 10002);
insert into post(id, description,user_id)
values(20004,'I want to learn Multicloud', 10002);