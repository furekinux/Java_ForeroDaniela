use btw3qkrwrj0nqyquwu5w;

create table tarjeta (
	id_tarjeta int not null primary key auto_increment,
	numero_cuenta varchar(20) not null,
    	valor_apertura decimal(10,2) not null,
    	mes enum("Enero",
			"Febrero",
			"Marzo",
			"Abril",
			"Mayo",
			"Junio",
			"Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre") not null
	tipo enum("Joven","Nomina","Visa") not null
);
