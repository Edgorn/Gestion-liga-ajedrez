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
public class Club {
    String nombre;
    ArrayList<Jugador> jugadores;
    ArrayList<Torneo> torneos;

    public Club() {
        jugadores = new ArrayList<Jugador>();
        torneos = new ArrayList<Torneo>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    public void addTorneo(Torneo torneo) {
        torneos.add(torneo);
    }
}
