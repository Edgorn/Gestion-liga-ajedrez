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
    ArrayList<Partida> partidas;
    Responsable responsable;

    public Jugador() {
        torneos = new ArrayList<Torneo>();
        partidas = new ArrayList<Partida>();
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
    
    public void addPartida(Partida partida) {
        partidas.add(partida);
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
    
    public ArrayList<Partida> partidaTorneo(Torneo t) {
        ArrayList <Partida> lista = new ArrayList<Partida>();
        
        for (int i=0; i<partidas.size(); i++) {
            if (partidas.get(i).esPartida(t)) {
                lista.add(partidas.get(i));
            }
        }
        
        return lista;
    }

    
    @Override
    public String tipo() {
        return "Jugador";
    }
    
    public Club getClub() {
        return club;
    }
}
