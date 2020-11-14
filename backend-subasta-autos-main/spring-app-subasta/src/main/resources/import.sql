
insert into personals(nombre,apellido,direccion,telefono) values('Miguel','Sacbin','Ciudad','0202 0202');

insert into usuarios (username,password,enabled,personal_id) values('Miguel','$2a$10$VI9EKCr7uZ2g5NUPC3g1tOtvpeSStDS3TLbCTB8eRbZ.XClcFRWCK',1,1);

insert into roles(nombre) values('ROLE_ADMIN');
insert into roles(nombre) values('ROLE_CLIENTE');

insert into usuarios_role(usuario_id,role_id)values(1,1);

insert into fecha_subastas(fecha,status)values('2020-11-02','A');
insert into fecha_subastas(fecha,status)values('2020-11-06','A');
insert into fecha_subastas(fecha,status)values('2020-11-09','A');
insert into fecha_subastas(fecha,status)values('2020-11-13','A');
insert into fecha_subastas(fecha,status)values('2020-11-16','A');
insert into fecha_subastas(fecha,status)values('2020-11-20','A');
insert into fecha_subastas(fecha,status)values('2020-11-23','A');
insert into fecha_subastas(fecha,status)values('2020-11-27','A');
insert into fecha_subastas(fecha,status)values('2020-11-30','A');

insert into hora_subastas(hora_inicio,hora_fin,status)values('17:30:00','19:20:00','A');

insert into tiempo_subastas(status,tiempo)values('A','120000');
