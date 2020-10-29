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
public class Jugador extends Usuario{

    Date nacimiento;
    Club club;
    ArrayList<Torneo> torneos;
    Responsable responsable;

    public Jugador() {
        torneos = new ArrayList<Torneo>();
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
    
    public void setResponsable(Responsable r) {
        responsable = r;
    }
    
    public Responsable getResponsable() {
        return responsable;
    }
    
    public ArrayList<Torneo> getTorneos(){
        return torneos;
    }
   
    public boolean inscrito(String t) {
        boolean respuesta = false;
        
        for (int i=0; i<torneos.size(); i++) {
            if (torneos.get(i).esTorneo(t)) {
                respuesta = true;
            }
        }
        
        return respuesta;
    }
    
    @Override
    public String tipo() {
        return "Jugador";
    }
}
