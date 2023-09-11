CREATE database SGP;
USE SGP

drop table historia_clinica
drop table paciente
CREATE TABLE paciente (
    tipo_DocumentoID VARCHAR(20),
    num_DocumentoID CHAR(10) PRIMARY KEY,
    nacionalidad VARCHAR(10),
    nombres VARCHAR(60),
    apellidos VARCHAR(60),
	direccion VARCHAR(170),
    celular CHAR(10),
    fecha_nacimiento CHAR(10),
    sexo CHAR(10),
    estado_civil CHAR(15),
    ocupacion VARCHAR(30),
	tipo_sangre CHAR(3),
    correo VARCHAR(50)
);

CREATE TABLE historia_clinica (
    id_historia CHAR(10) PRIMARY KEY,
    num_DocumentoID CHAR(10),
    contacto_emergencia_nombre VARCHAR(60),
    contacto_emergencia_apellido VARCHAR(60),
    contacto_emergencia_celular CHAR(10),
    contacto_emergencia_parentesco VARCHAR(15),
    alergia VARCHAR(80),
    enfermedad_hereditaria VARCHAR(60),
	enfermedad_hereditaria_1 VARCHAR(60),
	enfermedad_hereditaria_2 VARCHAR(60),
    tiempo INT,
    tiempo_1 INT,
    tiempo_2 INT,
    grado CHAR(1),
	grado_1 CHAR(1),
	grado_2 CHAR(1)
    --FOREIGN KEY (num_DocumentoID) REFERENCES paciente(num_DocumentoID)
);

/*  id_historia, num_DocumentoID, contacto_emergencia_nombre, contacto_emergencia_apellido, contacto_emergencia_celular, contacto_emergencia_parentesco, alergia, enfermedad_hereditaria, tiempo, grado*/

INSERT INTO paciente (tipo_DocumentoID, num_DocumentoID, nacionalidad, nombres, apellidos, direccion, celular, fecha_nacimiento, sexo, estado_civil, ocupacion, tipo_sangre, correo)
			values ('Cédula de identidad', '1003786264', 'Nacional', 'Pablo', 'Benitez', 'Av.12 Octubre Agora Casa de la Cultura', '0999878406', '2019-10-20', 'F', 'U', 'Bombero', 'A+', 'us@gmail.com');
delete historia_clinica
delete  paciente
select * from paciente
select * from historia_clinica where id_historia = 2
INSERT INTO paciente (tipo_DocumentoID, num_DocumentoID, nacionalidad, nombres, apellidos, direccion, celular, fecha_nacimiento, sexo, estado_civil, ocupacion, tipo_sangre, correo)
			values ('Cédula de identidad', '1003786256', 'Nacional', 'Pablo', 'Benitez', 'Av.12 Octubre Agora Casa de la Cultura', '0999878406', '2019-10-20', 'F', 'U', 'Bombero', 'A+', 'us@gmail.com');

INSERT INTO historia_clinica(id_historia, num_DocumentoID, contacto_emergencia_nombre, contacto_emergencia_apellido, contacto_emergencia_celular, contacto_emergencia_parentesco, alergia, enfermedad_hereditaria, enfermedad_hereditaria_1, enfermedad_hereditaria_2, tiempo, tiempo_1, tiempo_2, grado, grado_1, grado_2)
values ('1003786256', '1003786256', 'Jacqueline', 'Anrrango', '0999000999', 'Consanguíneo', 'maní', 'ninguno', 'ninguno', 'ninguno','0','0', '0','0', '0','0');
INSERT INTO historia_clinica(num_DocumentoID, contacto_emergencia_nombre, contacto_emergencia_apellido, contacto_emergencia_celular, contacto_emergencia_parentesco, alergia, enfermedad_hereditaria, tiempo, grado)
values ('1003786256', 'Jacqueline', 'Anrrango', '0999000999', 'Consanguíneo', 'maní', 'ninguna', '0','0');

alter table historia_clinica drop constraint FK__historia___num_D__48CFD27E
UPDATE historia_clinica SET num_DocumentoID = 1003786256 WHERE num_DocumentoID = (SELECT num_DocumentoID FROM paciente WHERE nombres = 'Erika' AND apellidos = 'Anrrango')
UPDATE paciente SET num_DocumentoID=1003786256 WHERE nombres='Erika' and apellidos='Anrrango'





INSERT INTO paciente (tipo_DocumentoID, num_DocumentoID, nacionalidad, nombres, apellidos, direccion, celular, fecha_nacimiento, sexo, estado_civil, ocupacion, tipo_sangre, correo)
			values ('Pasaporte', '100F6256', 'Extranjero', 'Esteban', 'Bajaña', 'Av.12 Octubre Agora Casa de la Cultura', '0999878406', '2019-10-20', 'Masculino', 'Soltero', 'Bombero', 'A+', 'usr@gmail.com');

INSERT INTO historia_clinica(id_historia, num_DocumentoID, contacto_emergencia_nombre, contacto_emergencia_apellido, contacto_emergencia_celular, contacto_emergencia_parentesco, alergia, enfermedad_hereditaria, tiempo, grado)
values (3,'100F6256', 'Pedro', 'Benitez', '0988000999', 'Consanguíneo', 'maní', 'ninguna', '0','0');




----tipo_DocumentoID, num_DocumentoID, nacionalidad, nombres, apellidos, direccion, celular, fecha_nacimiento, sexo, estado_civil, ocupacion, tipo_sangre, correo