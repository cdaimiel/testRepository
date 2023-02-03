CREATE DATABASE `testibm`; 

CREATE TABLE `proveedores` (
  `id_proveedor` int NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `fecha_alta` date DEFAULT NULL,
  `id_cliente` int DEFAULT NULL,
  PRIMARY KEY (`id_proveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


Insert into proveedores values(1,'Cocacola','2005/10/25',5);
Insert into proveedores values(2,'Pepsi','2008/05/13',5);
Insert into proveedores values(3,'Redbull','2002/07/17',6);

