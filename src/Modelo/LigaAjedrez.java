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
    Jugador jugadorActual;
    Torneo torneoActual;
    Responsable responsableActual;
    Partida partidaActual;
    
    public LigaAjedrez() {
        usuarios = new ArrayList<Usuario>();
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
        
        Administrador admin = new Administrador();
        admin.setNombre("admin");
        admin.setContraseña("admin");
        
        usuarios.add(j1);
        usuarios.add(j2);
        usuarios.add(j3);
        usuarios.add(admin);
        
        Club c1 = new Club();
        c1.setNombre("ValenciaCA");
        c1.addJugador(j1);
        c1.addJugador(j3);
        j1.setClub(c1);
        j3.setClub(c1);
        
        
        Club c2 = new Club();
        c2.setNombre("MadridCA");
        j2.setClub(c2);
        c2.addJugador(j2);
        
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
        j1.addPartida(p1);
        p1.setJ_visitante(j2);
        j2.addPartida(p1);
        p1.setTorneo(t1);
        t1.addPartida(p1);
    }
    
    //FUNCION DE LOGIN
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
    
    //FUNCION PARA REGISTRAR UN NUEVO JUGADOR
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
    
    //FUNCION PARA SELECCIONAR UN RESPONSABLE ACTUAL
    public void registrarResponsable(String n, Date f)  {
        responsableActual = new Responsable(n, f);
    }
    
    //FUNCION PARA DEVOLVER UN LISTA CON LOS NOMBRES DE TODOS LOS CLUBES
    public ArrayList<String> listaClubes() {
        ArrayList<String> lista = new ArrayList<String>();
        
        for (int i=0; i<clubes.size(); i++) {
            lista.add(clubes.get(i).getNombre());
        }
        
        return lista;
    }
    
    //FUNCION PARA DEVOLVER UN LISTA CON TODOS LOS PARTIDOS DEL JUGADOR ACTUAL
    public ArrayList<String> listaPartidasJugador(){
        ArrayList<Partida> lista_partidas = jugadorActual.partidaTorneo(torneoActual);
        ArrayList<String> lista = new ArrayList<String>();
        for(int i = 0; i < lista_partidas.size(); i++){
            lista.add(lista_partidas.get(i).nombrePartida());
        }
        
        return lista;
    }
    
    //FUNCION PARA DEVOLVER UN LISTA CON TODOS LOS PARTIDOS DE UN TORNEO
    public ArrayList<String> listaPartidasTorneo(){
        ArrayList<Partida> lista_partidas = torneoActual.getPartidas();
        ArrayList<String> lista = new ArrayList<String>();
        for(int i = 0; i < lista_partidas.size(); i++){
            lista.add(lista_partidas.get(i).nombrePartida());
        }
        
        return lista;
    }
    
    
    
    //FUNCION QUE DEVUELVE UNA LISTA CON TODOS LOS TORNEOS
    public ArrayList<String> listaTorneos() {
        
        ArrayList<String> lista = new ArrayList<String>();
        
        for (int i=0; i<torneos.size(); i++) {
            lista.add(torneos.get(i).getNombre());
        }
        
        return lista;
    }
    
    //FUNCION QUE DEVUELVE UN CLUB PASANDOLE EL NOMBRE
    public Club clubPorNombre(String nombre) {
        Club c = null;
        
        for (int i=0; i<clubes.size();i++) {
            if (clubes.get(i).esClub(nombre)) {
                c = clubes.get(i);
            }
        }
        
        return c;
    }
    
    //FUNCION PARA SELECCIONAR UN TORNEO DADO EL NOMBRE DE ESTE
    public void setTorneoActual(String t){
        
        for (int i=0; i<torneos.size();i++) {
            if (torneos.get(i).esTorneo(t)) {
                torneoActual = torneos.get(i);
            }
        }
    }
    
    //FUNCION PARA SELECCIONAR UNA PARTIDA DADO EL NOMBRE DE ESTE
    public void setPartidaActual(String p){
        
        for (int i=0; i<torneoActual.getPartidas().size();i++) {
            if (torneoActual.getPartidas().get(i).esPartida(p)) {
                partidaActual = torneoActual.getPartidas().get(i);
            }
        }
    }
    
    //FUNCION PARA SABER SI UN JUGADOR ESTA INSCRITO EN UN TORNEO
    public boolean inscrito() {
        return jugadorActual.inscrito(torneoActual.getNombre());
    }
    
    //FUNCION PARA INSCRIBIR UN JUGADOR EN UN TORNEO
    public void inscribirJugador() {
        torneoActual.addJugador(jugadorActual);
        jugadorActual.addTorneo(torneoActual);
    }
    
    
    //FUNCION QUE DEVUELVE EL NOMBRE DEL CLUB AL QUE PERTENECE EL JUGADOR ACTUAL
    public String getClub()
    {
        return jugadorActual.getClub().getNombre();
    }
    
    //FUNCION PARA CAMBIAR EL CLUB DEL JUGADOR ACTUAL
    public void cambiarClub(String club)
    {
        jugadorActual.getClub().quitarJugador(jugadorActual);
        jugadorActual.setClub(clubPorNombre(club));
        clubPorNombre(club).addJugador(jugadorActual);
    }
}
