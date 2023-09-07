package Logica.LogicaPrincipal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class LogUser {
    private final String username;
    private final String passwd;
    private String userType;
    private Encriptador cryp;

    public LogUser(String username, String passwd) {
        cryp = new Encriptador();
        this.username = cryp.encriptar(username);
        this.passwd = cryp.encriptar(passwd);
    }
    


    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getUserType() {
        return userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }
    
}
