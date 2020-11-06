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
    Jugador j_local,j_visitante;
    String sede, fecha, nombre;
    String duracion;        //en segundos
    Torneo torneo;
    
    public Partida(){
        
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

    public String nombrePartida() {
       return j_local.getNombre()+"-"+j_visitante.getNombre();
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

    public void setDuracion(String duracion) {
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
        
        if(nombrePartida() == t)
            respuesta = true;
        else
            respuesta = false;
            
        return respuesta;
        
    }
    
}