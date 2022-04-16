-- insert in system user
insert into system_user (id,user_name,password) values (user_sequence.nextval,'ticketsrv','ticketsrv');
-- insert the ticket
insert into ticket (id,customer_id,delivery_id,ticket_creation_time,ticket_desc,status,priority, ticket_close_time) values (ticketsrv_sequence.nextval, 1,1,TIMESTAMP '2015-01-14T21:32:29','Delivery Id 1 for Customer ID is very late and didnt reach the destination on time. Raising a ticket.', 'Open','High',TIMESTAMP '2015-01-14T21:32:29');
insert into ticket (id,customer_id,delivery_id,ticket_creation_time,ticket_desc,status,priority, ticket_close_time) values (ticketsrv_sequence.nextval, 1,2,TIMESTAMP '2015-01-14T21:32:29','Delivery Id 1 for Customer ID is very late and didnt reach the destination on time. Raising a ticket.', 'Open','Medium',TIMESTAMP '2015-01-14T21:32:29');
insert into ticket (id,customer_id,delivery_id,ticket_creation_time,ticket_desc,status,priority, ticket_close_time) values (ticketsrv_sequence.nextval, 1,3,TIMESTAMP '2015-01-14T21:32:29','Delivery Id 1 for Customer ID is very late and didnt reach the destination on time. Raising a ticket.', 'Open','Low',TIMESTAMP '2015-01-14T21:32:29');