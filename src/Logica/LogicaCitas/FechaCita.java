/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.LogicaCitas;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class FechaCita {
    private Date fecha;
    private String hora;

    public FechaCita(Date fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
}
