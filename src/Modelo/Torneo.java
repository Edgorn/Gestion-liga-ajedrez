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
    ArrayList<Partida> partidas;

    public Torneo() {
        clubes = new ArrayList<Club>();
        jugadores = new ArrayList<Jugador>();
        partidas = new ArrayList<Partida>();
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
    
    public void addPartida(Partida partida) {
        partidas.add(partida);
    }
    
    public ArrayList<Partida> getPartidas(){
        return this.partidas;
    }
    
    public ArrayList<String> getNombrePartidas(){
        ArrayList <String> lista = new ArrayList<String>();
        
        for (int i=0; i<partidas.size(); i++) {
            lista.add(partidas.get(i).nombrePartida());
        }
        
        return lista;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public boolean esTorneo(String n) {
        boolean respuesta;
        
        if (nombre.equals(n)) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        
        return respuesta;
    }
    
    public ArrayList<String> getNombreJugadores(){
        ArrayList <String> lista = new ArrayList<String>();
        
        for (int i=0; i<jugadores.size(); i++) {
            lista.add(jugadores.get(i).getNombre());
        }
        
        return lista;
    }
    
    public ArrayList<String> getSedes() {
        ArrayList <String> lista = new ArrayList<String>();
        
        for (int i=0; i<clubes.size(); i++) {
            lista.add(clubes.get(i).getSede());
        }
        
        return lista;
    }
    
    public void eliminarPartida(Partida partida) {
        partidas.remove(partida);
    }
    
    public void eliminarClub(Club club) {
        clubes.remove(club);
    }
}
