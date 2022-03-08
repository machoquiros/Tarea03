/*DROP SCHEMA tarea03;
DROP USER usuario_tarea03;*/

CREATE SCHEMA `tarea03`;

/*Crea la tabla contacto*/
CREATE TABLE `tarea03`.`contacto` (
	`id_contacto` INT NOT NULL AUTO_INCREMENT, 
	`nombre_contacto` VARCHAR(30) NOT NULL, 
	`apellidos_contacto` VARCHAR(50) NOT NULL,
	`correo_contacto` VARCHAR(50) NULL, 
	`telefono_contacto` VARCHAR(15) NULL, 
	PRIMARY KEY (`id_contacto`)
)
ENGINE = innoDB;

/*Insertar 4 registros*/
INSERT INTO `tarea03`.`contacto` (`nombre_contacto`, `apellidos_contacto`, `correo_contacto`, `telefono_contacto`)
	VALUES ('Jonathan', 'Brenes Blanco', 'jbrenes@gmail.com', '8820-2655');
    
INSERT INTO `tarea03`.`contacto` (`nombre_contacto`, `apellidos_contacto`, `correo_contacto`, `telefono_contacto`)
	VALUES ('Ana', 'Contreras Mora', 'acontreras@gmail.com', '5456-8789');
    
INSERT INTO `tarea03`.`contacto` (`nombre_contacto`, `apellidos_contacto`, `correo_contacto`, `telefono_contacto`)
	VALUES ('Luis', 'Mena Loria', 'lmena@gmail.com', '7898-893');
    
INSERT INTO `tarea03`.`contacto` (`nombre_contacto`, `apellidos_contacto`, `correo_contacto`, `telefono_contacto`)
	VALUES ('Fabian', 'Lopez Perez', 'flopez@gmail.com', '7898-893');

/*Crea la tabla receta*/
CREATE TABLE `tarea03`.`receta` (
  `id_receta` int NOT NULL AUTO_INCREMENT,
  `nombre_receta` varchar(50) NOT NULL,
  `duracion_receta` int NOT NULL,
  `dificultad_receta` varchar(45) NOT NULL,
  `ingredientes_receta` varchar(150) NOT NULL,
  `preparacion_receta` varchar(300) NOT NULL,
  `calificacion_receta` float NOT NULL,
  PRIMARY KEY (`id_receta`)
) ENGINE=InnoDB;

/*Insertar 4 registros*/
INSERT INTO `tarea03`.`receta`(`nombre_receta`,`duracion_receta`,`dificultad_receta`,`ingredientes_receta`,`preparacion_receta`,`calificacion_receta`)
VALUES
('Receta del Agua',1,'Alto','agua','Poner el agua en un vaso',5);


/* Crear un usuario */
CREATE USER 'usuario_tarea03' @'%' IDENTIFIED BY 'tarea03';

/* Se asignan los priviliegios */
GRANT ALL PRIVILEGES ON tarea03.* to 'usuario_tarea03';
flush privileges;