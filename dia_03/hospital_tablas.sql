-- ######################################
-- ####### Dia 03 - MySQL y Java ########
-- ######################################

-- Usar base de datos
create database hospital;
use hospital;

-- Crear Tabla Hospital
create table hospital(
	id int primary key auto_increment not null,
    nombre varchar(50) not null,
    direccion varchar(120) not null
);

-- Crear Tabla Departamento
create table departamento(
	id int primary key auto_increment not null,
    id_hospital int not null,
    foreign key(id_hospital)references hospital(id),
    nombre varchar(50) not null
);

-- Crear Tabla Pabellón
create table pabellon(
	id int primary key auto_increment not null,
    id_hospital int not null,
    foreign key(id_hospital)references hospital(id),
    nombre varchar(50) not null,
    capacidad int,
    ubicacion varchar(40) not null
);

-- Crear Tabla Personal
create table personal(
	id int primary key auto_increment not null,
    id_departamento int not null,
    foreign key(id_departamento)references departamento(id),
    fecha_vinculacion date not null,
    nombres varchar(35) not null,
    apellidos varchar(35) not null,
    direccion varchar(120) not null,
    titulo varchar(45),
    tipo enum("Administrativo","Técnico","Operaciones") not null,
    salario decimal(10,2)
);

-- Crear Tabla Equipo
create table equipo(
	id int primary key auto_increment not null,
    id_lider int not null,
    foreign key(id_lider)references personal(id),
    nombre varchar(50) not null
);

-- Crear Tabla Equipo + Personal
create table equipo_personal(
	id_equipo int not null,
    id_personal int not null,
    primary key(id_equipo,id_personal)
);

-- Crear Tabla Paciente
create table paciente(
	id int primary key auto_increment not null,
    id_doctor int not null,
    foreign key(id_pabellon)references personal(id),
    id_pabellon int not null,
    foreign key(id_pabellon)references pabellon(id),
    nombres varchar(35) not null,
    apellidos varchar(35) not null,
    direccion varchar(120) not null,
    fecha_nacimiento date not null,
    fecha_ingreso date not null
);
select * from hospital;

insert into hospital(nombre,direccion)values("San José","La esquina");
insert into hospital(nombre,direccion)values("San Francisco","Cra 15")