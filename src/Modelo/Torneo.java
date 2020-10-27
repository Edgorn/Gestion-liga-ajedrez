/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public class Torneo {
    String nombre;
    ArrayList<Club> clubes;
    ArrayList<Jugador> jugadores;

    public Torneo() {
        clubes = new ArrayList<Club>();
        jugadores = new ArrayList<Jugador>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addClub(Club club) {
        clubes.add(club);
    }

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    
    
    
}
