/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Logica.LogicaMedicos;

/**
 *
 * @author Usuario
 */
public enum AtributosMedicos {
    Especialidad("especialidad_medico"),
    Correo_Electrónico("email_medico"),
    Dirección("direccion_medico"),
    Numero_De_Celular("celular_medico");
    private String parametro;
    
    AtributosMedicos(String parametro) {
        this.parametro = parametro;
    }

    public String getValue() {
        return parametro;
    }    
}
