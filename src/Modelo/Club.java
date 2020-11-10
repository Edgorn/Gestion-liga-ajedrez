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
    private String nombre;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Torneo> torneos;
    private float cuota;
    private String sede;
    private Gerente gerente;

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
    
    public void quitarJugador(Jugador jugador)
    {
        for(int i=0; i<jugadores.size();i++)
        {
            if(jugadores.get(i) == jugador)
            {
                jugadores.remove(i);
            }
        }
    }
    
    public void addTorneo(Torneo torneo) {
        torneos.add(torneo);
    }

    public String getNombre() {
        return nombre;
    }
    
    public boolean esClub(String n){
        boolean respuesta;
        if (nombre.equals(n)) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        
        return respuesta;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
    
    public void eliminarJugadores() {
        for(int i=0; i<jugadores.size();i++)
        {
            jugadores.get(i).setClub(null);
        }
    }
    
    public void salirTorneos() {
        for(int i=0; i<torneos.size();i++)
        {
            torneos.get(i).eliminarClub(this);
        }
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
