/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author vicen
 */
public class Partida {
    String j_local,j_visitante, sede, fecha;
    String duracion;        //en minutos
    Club local, visitante;
    
    public Partida(){
        
    }
    
    
    public String getJ_local() {
        return j_local;
    }

    public String getJ_visitante() {
        return j_visitante;
    }

    public String getSede() {
        return sede;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public Club getLocal() {
        return local;
    }

    public Club getVisitante() {
        return visitante;
    }

    public void setJ_local(String j_local) {
        this.j_local = j_local;
    }

    public void setJ_visitante(String j_visitante) {
        this.j_visitante = j_visitante;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setLocal(Club local) {
        this.local = local;
    }

    public void setVisitante(Club visitante) {
        this.visitante = visitante;
    }
    
    
}