create database carrito;
use carrito;

create table cliente(
id_cliente int not null primary key auto_increment,
nombre varchar(30),
apellidos varchar(30),
dni varchar(8),
telefono varchar(9),
email varchar(50)
);

create table producto(
id_producto int not null primary key auto_increment,
nombre varchar(30),
precio decimal(5,2)
);

create table venta(
id_venta int not null primary key auto_increment,
id_cliente int,
fecha date,
CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`)
);

create table detalle_venta(
id_detalle_venta int not null primary key auto_increment,
id_venta int,
id_producto int,
CONSTRAINT `detalle_venta_ibfk_1` FOREIGN KEY (`id_venta`) REFERENCES `venta` (`id_venta`),
CONSTRAINT `detalle_venta_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`)
);
