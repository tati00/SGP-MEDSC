/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Logica.LogicaPrincipal;

/**
 *
 * @author Usuario
 */
public enum AtributosUser {
    // Todo: Actualizar de Acuerdo al Nombre de la Database
    Id_User("id_medico"),
    Nombre_de_Usuario("usuario"),
    Correo_Electrónico("email"),
    Contraseña("contrasena");
    private String parametro;
    
    AtributosUser(String parametro) {
        this.parametro = parametro;
    }

    public String getValue() {
        return parametro;
    }
}
