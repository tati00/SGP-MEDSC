/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaMedicos;

import Logica.LogicaPrincipal.ErrorValidaciones;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Medico {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String numeroCelular;
    private String email;
    private String especialidad;
    private String direccion;


    public Medico(String cedula, String nombres, String apellidos, String numeroCelular, String especialidad, String direccion, String email) throws SQLException {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroCelular = numeroCelular;
        this.email = email;
        this.especialidad = especialidad;
        this.direccion = direccion;
    }

    Medico(String nombres, String apellidos, String numeroCelular, String email, String especialidad, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroCelular = numeroCelular;
        this.email = email;
        this.especialidad = especialidad;
        this.direccion = direccion;        
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getEmail() {
        return email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
}
