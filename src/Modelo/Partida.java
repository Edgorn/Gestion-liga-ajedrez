/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author vicent
 */
public class Partida {
    static int contador = 0;
    private int id;
    Jugador j_local, j_visitante;
    String sede, fecha, ganador;
    int duracion;        //en segundos
    Torneo torneo;
    
    public Partida(){
        duracion = 0;
        id = contador;
        contador++;
    }
    
    public String getSede() {
        return sede;
    }

    public String getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public String nombrePartida() {
       return id+" - "+j_local.getNombre()+" - "+j_visitante.getNombre();
    }
    
    public void setJ_local(Jugador j_local) {
        this.j_local = j_local;
    }

    public void setJ_visitante(Jugador j_visitante) {
        this.j_visitante = j_visitante;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }
    
    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean partidaTorneo(Torneo torneoActual){
        boolean respuesta;
        
        if(torneo.getNombre() == torneoActual.getNombre())
            respuesta = true;
        else
            respuesta = false;
            
        return respuesta;
    }
    
    public boolean esPartida(String t) {
        boolean respuesta;
        
        if(nombrePartida().equals(t))
            respuesta = true;
        else
            respuesta = false;
            
        return respuesta;
        
    }

    public Jugador getJ_local() {
        return j_local;
    }

    public Jugador getJ_visitante() {
        return j_visitante;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(int g) {
        if (g==1) {
            this.ganador = "local";
        } else if (g==2) {
            this.ganador = "visitante";
        } else {
            ganador = "NADIE";
        }
    }
}