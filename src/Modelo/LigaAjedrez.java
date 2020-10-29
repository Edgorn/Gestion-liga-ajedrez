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
    
    ArrayList<Usuario> usuarios;
    ArrayList<Club> clubes;
    ArrayList<Torneo> torneos;
    ArrayList<Partida> partidas;
    Jugador jugadorActual;
    Torneo torneoActual;
    Responsable responsableActual;
    
    public LigaAjedrez() {
        usuarios = new ArrayList<Usuario>();
        clubes = new ArrayList<Club>();
        torneos = new ArrayList<Torneo>();
        partidas = new ArrayList<Partida>();
        
        Jugador j1 = new Jugador();
        j1.setNombre("Edgar");
        j1.setContraseña("123");
        
        Jugador j2 = new Jugador();
        j2.setNombre("Vicente");
        j2.setContraseña("456");
        
        Jugador j3 = new Jugador();
        j3.setNombre("Gerard");
        j3.setContraseña("789");
        
        Administrador admin = new Administrador();
        admin.setNombre("admin");
        admin.setContraseña("admin");
        
        usuarios.add(j1);
        usuarios.add(j2);
        usuarios.add(j3);
        usuarios.add(admin);
        
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
        
        Partida p1 = new Partida();
        p1.setJ_local(j1);
        p1.setJ_visitante(j2);
    }
    
    public String login(String n, String c) {
        String respuesta = "Nadie";
        
        for(int i=0; i<usuarios.size();i++) {
            if (usuarios.get(i).login(n, c)) {
                respuesta = usuarios.get(i).tipo();
                if (respuesta.equals("Jugador")) {
                    jugadorActual = (Jugador) usuarios.get(i);
                }
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
                    int anyo = nacimiento.getYear();
                    
                    if (anyo>(2020-16)) {
                        j.setResponsable(responsableActual);
                        responsableActual=null;
                    }
                    
                    if (j.getResponsable()==null) {
                        System.out.println("Debes registrar un responsable primero");
                        j=null;
                    } else {
                        usuarios.add(j);
                        clubes.get(i).addJugador(j);
                    }
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
    
    public void registrarResponsable(String n, Date fecha) {
        responsableActual = new Responsable(n, fecha);
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
}
