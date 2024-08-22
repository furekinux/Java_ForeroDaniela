use `bln8hdlqthnjd1ymkepw`;

create table cliente(
	id_cliente int primary key not null auto_increment,
	nombre varchar(40) not null,
    apellido varchar(40) not null,
    identificacion varchar(9) not null
);

create table factura(
	id_factura int primary key not null auto_increment,
    id_cliente int not null,
    total decimal(10,2),
	foreign key(id_cliente)references cliente(id_cliente)
);