
create table equipo(
	id_equipo int primary key not null auto_increment,
    nombre_equipo varchar(30) not null
);

create table partido(
	id_partido int primary key not null auto_increment,
    id_equipo_local int,
    foreign key(id_equipo_local)references equipo(id_equipo),
    id_equipo_visitante int,
    foreign key(id_equipo_visitante)references equipo(id_equipo),
    cestas_local int,
    cestas_visitante int,
    estado boolean,
    fecha_partido date not null
);

create table partido_liga(
	id_partido int not null,
    foreign key(id_partido)references partido(id_partido),
    primary key(id_partido),
    jornada smallint
);

create table partido_playoff(
	id_partido int not null,
    foreign key(id_partido)references partido(id_partido),
    primary key(id_partido),
    ronda enum( "Octavos","Cuartos","Final")
);