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
    
    public LigaAjedrez() {
        jugadores = new ArrayList<Jugador>();
        clubes = new ArrayList<Club>();
        torneos = new ArrayList<Torneo>();
        
        /*
            AÑADIR VALORES DE PRUEBA
        */
    }
}
