/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author edgar
 */
public class Jugador {
    String nombre;
    String contraseña;
    Date nacimiento;
    Club club;
    ArrayList<Torneo> torneos;

    public Jugador() {
        torneos = new ArrayList<Torneo>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setClub(Club club) {
        this.club = club;
    }
    
    public void addTorneo(Torneo torneo) {
        torneos.add(torneo);
    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public ArrayList<Torneo> getTorneos(){
        return torneos;
    }
   
    
}
