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
public class Gerente {
    String nombre;
    float nomina;
    float irpf;
    Club club;
    
    ArrayList <Club> historicoClubes;
    ArrayList historicoNominas;
    ArrayList historicoIrpf;
    
    public Gerente() {
        historicoClubes = new ArrayList<Club>();
        historicoNominas = new ArrayList();
        historicoIrpf = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        if (club == null) {
            this.club = club;
        } else if (club != this.club) {
            this.club = club;
            historicoClubes.add(club);
        }
    }
    
    public boolean libre() {
        boolean respuesta;
        
        if (club==null) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        
        return respuesta;
    }
    
}
