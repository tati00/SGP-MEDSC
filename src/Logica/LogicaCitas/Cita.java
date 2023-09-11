/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaCitas;


import Logica.LogicaMedicos.ConexionMedicos;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cita {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String especialidad;
    private String medico;
    private Date fecha;
    private String hora;
    private String codigo;


    public Cita(String cedula, String nombres, String apellidos, String especialidad, String medico, Date fecha, String hora) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
    }

    Cita(String codigo, String nombre, String apellido, Date fecha, String hora, String medico) {
       this.codigo = codigo;
       this.nombres = nombre;
       this.apellidos = apellido;
       this.fecha = fecha;
       this.hora = hora;
       this.medico = medico;
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

    public String getMedico() {
        return medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getCodigo() {
        return codigo;
    }
    
    
}
