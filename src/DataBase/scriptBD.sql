USE master;
drop DATABASE MEDSC;
CREATE database MEDSC;
USE MEDSC;


CREATE TABLE antecedente_familiar (
	num_DocumentoID CHAR(10) PRIMARY KEY,
    enfermedad_hereditaria VARCHAR(60),
	enfermedad_hereditaria_1 VARCHAR(60),
	enfermedad_hereditaria_2 VARCHAR(60),
    tiempo INT,
    tiempo_1 INT,
    tiempo_2 INT,
    grado CHAR(1),
	grado_1 CHAR(1),
	grado_2 CHAR(1)
);

CREATE TABLE atencion (
    id_atencion INT IDENTITY(1,1) PRIMARY KEY,
    num_DocumentoID CHAR(10),
	IDENTIFICADOR CHAR(10),
    fecha DATE,
	peso FLOAT,
    talla FLOAT,
    temperatura FLOAT,
    frecuencia_cardiaca FLOAT,
    tension_arterial FLOAT,
    saturacion_o2 FLOAT,
    frecuencia_respiratoria FLOAT,
    motivo_consulta VARCHAR(200),
    enfermedad_actual VARCHAR(200),
    organo_sistema CHAR(12),
    evidencia_patologica_organo_sistema VARCHAR(200),
    descripcion_organo_sistema VARCHAR(200),
    region CHAR(12),
    evidencia_patologica_region VARCHAR(200),
    descripcion_region VARCHAR(200)
);

CREATE TABLE atencion_medicacion(
	id_atencion INT, 
    id_medicacion INT,
);

CREATE TABLE historia_clinica (
    id_historia CHAR(10) PRIMARY KEY,
    contacto_emergencia_nombre VARCHAR(60),
    contacto_emergencia_apellido VARCHAR(60),
    contacto_emergencia_celular CHAR(10),
    contacto_emergencia_parentesco VARCHAR(15),
    alergia VARCHAR(80)
);

CREATE TABLE interconsulta (
	id_interconsulta INT IDENTITY(1,1) PRIMARY KEY,
    num_DocumentoID CHAR(10),
    fecha DATE,
    prioridad VARCHAR(7),
    nivel_consulta CHAR(1),
    p_solicitar VARCHAR(200),
);

CREATE TABLE medicacion (
    id_medicacion INT IDENTITY(1,1) PRIMARY KEY,
    nombre_medicamento VARCHAR(100),
    via_administracion VARCHAR(10),
    dosis INT,
    unidades VARCHAR(8),
    frecuencia VARCHAR(100),
    indicaciones VARCHAR(200),
    advertencias VARCHAR(200),
    evolucion VARCHAR(200)
);

CREATE TABLE enfermedad (
    id_enfermedad INT IDENTITY(1,1) PRIMARY KEY,
    codigo_CIE10 VARCHAR(10),
    N_enfermedad VARCHAR(100),
    observacion VARCHAR(200),
    condicion VARCHAR(45),
    cronologia VARCHAR(11),
);

CREATE TABLE atencion_enfermedad(
	id_atencion INT, 
    id_enfermedad INT,
);



CREATE TABLE orden_medica (
    id_orden INT IDENTITY(1,1) PRIMARY KEY,
	num_DocumentoID CHAR(10),
    fecha_actual DATE,
    tipo_examen VARCHAR(14),
    prioridad VARCHAR(7)
);

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

-----

CREATE TABLE medicos (
    id_medico CHAR(10) PRIMARY KEY,
    nombres_medico VARCHAR(30),
    apellidos_medico VARCHAR(30),
    celular_medico CHAR(10),
    email_medico VARCHAR(30),
    especialidad_medico VARCHAR(30),
	direccion_medico VARCHAR(20)
);


-----------
CREATE TABLE cita_medica (
    id_cita INT IDENTITY,
    id_medico CHAR(10),
	cedula_paciente VARCHAR(10),
	nombre_paciente VARCHAR(30),
	Apellido_paciente VARCHAR(30),
    fecha DATE,
    hora VARCHAR(10),
);

--- TABLA DEFINITIVA
CREATE TABLE usuarios (
    id_usuario CHAR(10) PRIMARY KEY,
    username VARCHAR(25),
    nombres_user VARCHAR(30),
    apellidos_user VARCHAR(30),
    email_user VARCHAR(30), 
    contrasena VARCHAR(25),
	tipo_usuario VARCHAR(25) DEFAULT 'Médico',
	pin VARCHAR(5)
);


/*========================*/
/*			FK's	      */
/*========================*/
alter table antecedente_familiar
   add constraint FK_ANTECEDE_POSEE_PACIENTE foreign key (num_DocumentoID)
      references paciente (num_DocumentoID)
go

alter table atencion
   add constraint FK_ATENCION_RELATIONS_PACIENTE foreign key (num_DocumentoID)
      references paciente (num_DocumentoID)
go


alter table atencion_enfermedad
   add constraint PK_atencion_RELATIONS_enfermedad foreign key (id_atencion)
      references atencion (id_atencion)
go

alter table atencion_enfermedad
   add constraint PK_atencion_RELATIONS_enfermedad2 foreign key (id_enfermedad)
      references enfermedad (id_enfermedad)
go

alter table atencion_medicacion
   add constraint PK_atencion_RELATIONS_medicacion foreign key (id_atencion)
      references atencion (id_atencion)
go

alter table atencion_medicacion
   add constraint PK_atencion_RELATIONS_medicacion2 foreign key (id_medicacion)
      references medicacion (id_medicacion)
go


alter table historia_clinica
   add constraint FK_HISTORIA_PACIENTE foreign key (id_historia)
      references paciente (num_DocumentoID)
go

alter table orden_medica
   add constraint FK_ORDEN_RELATIONS_PACIENTE foreign key (num_DocumentoID)
      references paciente (num_DocumentoID)
go

alter table interconsulta
   add constraint FK_INTERCON_RELATIONS_PACIENTE foreign key (num_DocumentoID)
      references paciente (num_DocumentoID)
go

/*CREATE FUNCTION GenerarIDCita (@n_documento VARCHAR(10)) RETURNS VARCHAR(20)
AS
BEGIN
    DECLARE @fecha_actual DATE = GETDATE();
    DECLARE @ultimos_digitos VARCHAR(2) = RIGHT(@n_documento, 2);
    DECLARE @id_cita VARCHAR(20) = CONVERT(VARCHAR, @fecha_actual, 112) + @ultimos_digitos;
    RETURN @id_cita;
END;*/

/*
INSERT INTO cita_medica (id_cita, id_medico, n_documento, fecha, hora)
VALUES (dbo.GenerarIDCita('1234567890'), 'medico_id', 'paciente_documento', '2023-09-01', '09:00');*/



-- Insertando el usuario ADMIN
INSERT INTO Usuarios(id_usuario, nombres_user,apellidos_user,email_user,username,contrasena,tipo_usuario,pin) VALUES ('1753789231','Jose','m','medsc.038@gmail.com','PYQMwtG693pOx8JTipLglw==','F5I8YCQGcpUwIv4C2fqFuQ==','Medico Principal','12345')

ALTER TABLE cita_medica
ADD CONSTRAINT FK_CITA_MEDICOS
FOREIGN KEY (id_medico) REFERENCES medicos(id_medico)
ON DELETE CASCADE
ON UPDATE CASCADE

---- PERMISOS CONEXION CON JAVA
USE master
CREATE LOGIN grupo1 WITH PASSWORD ='grupo1ABC';
-- creando usuario de database MEDSC

USE MEDSC
CREATE USER grupo1 FOR LOGIN grupo1


-- PERMITIR CONEXIÓN A USUARIO name
GRANT CONNECT TO grupo1

-- OTORGAR PERMISOS AL USUARIO name
GRANT SELECT,UPDATE, DELETE, INSERT ON Usuarios to grupo1
GRANT SELECT,UPDATE, DELETE, INSERT ON medicos to grupo1
GRANT SELECT,UPDATE, DELETE, INSERT ON cita_medica to grupo1
