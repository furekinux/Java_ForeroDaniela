-- ######################################
-- ####### Dia 03 - MySQL y Java ########
-- ######################################

-- Usar base de datos
use `bclzsd9hip6j1proyaic`;

-- Crear Tabla Hospital
create table hospital(
	id_hospital int primary key auto_increment not null,
    nombre_hospital varchar(50) not null,
    direccion_hospital varchar(120) not null
);

-- Crear Tabla Departamento
create table departamento(
	id_departamento int primary key auto_increment not null,
    id_hospital int not null,
    foreign key(id_hospital)references hospital(id_hospital),
    nombre_departamento varchar(50) not null
);

-- Crear Tabla Pabellón
create table pabellon(
	id_pabellon int primary key auto_increment not null,
    id_hospital int not null,
    foreign key(id_hospital)references hospital(id_hospital),
    nombre_pabellon varchar(50) not null,
    capacidad int,
    ubicacion varchar(40) not null
);

-- Crear Tabla Personal
create table personal(
	id_personal int primary key auto_increment not null,
    id_departamento int not null,
    foreign key(id_departamento)references departamento(id_departamento),
    fecha_vinculacion date not null,
    nombres_personal varchar(35) not null,
    apellidos_personal varchar(35) not null,
    direccion varchar(120) not null,
    titulo varchar(45),
    tipo enum("Administrativo","Técnico","Operaciones") not null,
    salario decimal(10,2)
);
drop tables hospital,departamento,pabellon,personal,equipo,equipo_personal;
-- Crear Tabla Equipo
create table equipo(
	id_equipo int primary key auto_increment not null,
    id_lider int not null,
    foreign key(id_lider)references personal(id_personal),
    nombre_equipo varchar(50) not null
);

-- Crear Tabla Equipo + Personal
create table equipo_personal(
	id_equipo int not null,
    foreign key(id_equipo)references equipo(id_equipo),
    id_personal int not null,
    foreign key(id_personal)references personal(id_personal),
    primary key(id_equipo,id_personal)
);

-- Crear Tabla Paciente
create table paciente(
	id_paciente int primary key auto_increment not null,
    id_doctor int not null,
    foreign key(id_pabellon)references personal(id_personal),
    id_pabellon int not null,
    foreign key(id_pabellon)references pabellon(id_pabellon),
    nombres_paciente varchar(35) not null,
    apellidos_paciente varchar(35) not null,
    direccion varchar(120) not null,
    fecha_nacimiento date not null,
    fecha_ingreso date not null
);