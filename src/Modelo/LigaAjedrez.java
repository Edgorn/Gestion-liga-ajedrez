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
public class LigaAjedrez {
    
    ArrayList<Jugador> jugadores;
    ArrayList<Club> clubes;
    ArrayList<Torneo> torneos;
    Jugador jugadorActual;
    
    public LigaAjedrez() {
        jugadores = new ArrayList<Jugador>();
        clubes = new ArrayList<Club>();
        torneos = new ArrayList<Torneo>();
        
        Jugador j1 = new Jugador();
        j1.setNombre("Edgar");
        j1.setContraseña("123");
        
        Jugador j2 = new Jugador();
        j2.setNombre("Vicente");
        j2.setContraseña("456");
        
        Jugador j3 = new Jugador();
        j3.setNombre("Gerard");
        j3.setContraseña("789");
        
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        
        Club c1 = new Club();
        c1.setNombre("ValenciaCA");
        c1.addJugador(j1);
        
        Club c2 = new Club();
        c2.setNombre("MadridCA");
        
        Torneo t1 = new Torneo();
        t1.setNombre("Liga Endesa");
        t1.addClub(c2);
        t1.addJugador(j1);
        j1.addTorneo(t1);
    }
    
    public String login(String n, String c) {
        String respuesta = "Nadie";
        
        for(int i=0; i<jugadores.size();i++) {
            if (jugadores.get(i).getNombre().equals(n) && jugadores.get(i).getContraseña().equals(c)) {
                respuesta = "jugador";
                jugadorActual = jugadores.get(i);
            }
        }
        
        return respuesta;
    }
    
    public Jugador getJugador(){
        return jugadorActual;
    }
}
