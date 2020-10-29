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
public class LigaAjedrez {
    
    ArrayList<Jugador> jugadores;
    ArrayList<Club> clubes;
    ArrayList<Torneo> torneos;
    Jugador jugadorActual;
    Torneo torneoActual;
    
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
        //c1.addJugador(j1);
        
        
        Club c2 = new Club();
        c2.setNombre("MadridCA");
        
        clubes.add(c1);
        clubes.add(c2);
        
        Torneo t1 = new Torneo();
        t1.setNombre("Liga Endesa");
        t1.addJugador(j1);
        j1.addTorneo(t1);
        torneos.add(t1);
        
        Torneo t2 = new Torneo();
        t2.setNombre("Liga jeje");
        torneos.add(t2);
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
    
    public ArrayList<String> listaClubes() {
        ArrayList<String> lista = new ArrayList<String>();
        
        for (int i=0; i<clubes.size(); i++) {
            lista.add(clubes.get(i).getNombre());
        }
        
        return lista;
    }
    
    public boolean registrarJugador(String nombre, String contrasenya, Date nacimiento, String club) {
        boolean insercion;
        Jugador j = null;
        
        if (login(nombre,contrasenya).equals("Nadie")) {
            for (int i=0; i<clubes.size();i++) {
                if (clubes.get(i).esClub(club)) {
                    j = new Jugador();
                    j.setNombre(nombre);
                    j.setContraseña(contrasenya);
                    j.setNacimiento(nacimiento);
                    j.setClub(clubes.get(i));
                    jugadores.add(j);
                    clubes.get(i).addJugador(j);
                }
            }
        }
            
        if (j==null) {
            insercion = false;
        } else {
            insercion = true;
        }
        
        return insercion;
    }
    
    public Club clubPorNombre(String nombre) {
        Club c = null;
        
        for (int i=0; i<clubes.size();i++) {
            if (clubes.get(i).esClub(nombre)) {
                c = clubes.get(i);
            }
        }
        
        return c;
    }
    
    public ArrayList<String> listaTorneos() {
        ArrayList<String> lista = new ArrayList<String>();
        
        for (int i=0; i<torneos.size(); i++) {
            lista.add(torneos.get(i).getNombre());
        }
        
        return lista;
    }
    
    public void setTorneoActual(String t){
        
        for (int i=0; i<torneos.size();i++) {
            if (torneos.get(i).esTorneo(t)) {
                torneoActual = torneos.get(i);
            }
        }
    }
    
    public boolean inscrito() {
        return jugadorActual.inscrito(torneoActual.getNombre());
    }
    
    public void inscribirJugador() {
        torneoActual.addJugador(jugadorActual);
        jugadorActual.addTorneo(torneoActual);
    }
    
    /*public Torneo getTorneoActual(){
        return torneoActual;
    }
    
    public void inscribirJugador(Torneo t){
        t.addJugador(jugadorActual);
    }*/
}
