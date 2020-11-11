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

    public float getNomina() {
        return nomina;
    }

    public void setNomina(float n) {
        if (nomina != n) {
            nomina = n;
            historicoNominas.add(nomina);
        }
    }

    public float getIrpf() {
        return irpf;
    }

    public void setIrpf(float i) {
        if (irpf != i) {
            irpf = i;
            historicoIrpf.add(irpf);
        }
    }
    
    public boolean esGerente(String n) {
        boolean respuesta;
        
        if (nombre.equals(n)) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        
        return respuesta;
    }

    public ArrayList<Club> getHistoricoClubes() {
        return historicoClubes;
    }

    public ArrayList getHistoricoNominas() {
        return historicoNominas;
    }

    public ArrayList getHistoricoIrpf() {
        return historicoIrpf;
    }
    
    
}
