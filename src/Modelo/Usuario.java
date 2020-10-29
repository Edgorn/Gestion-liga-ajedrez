/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author edgar
 */
public class Usuario {
    String nombre;
    String contraseña;
    
    public Usuario () {
        
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public boolean login(String n, String c) {
        boolean respuesta;
        
        if (nombre.equals(n) && contraseña.equals(c)) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        
        return respuesta;
    }
    
    public String tipo() {
        return "usuario";
    }
    
}
