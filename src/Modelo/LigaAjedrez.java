/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
    ArrayList<Gerente> gerentes;
    
    Jugador jugadorActual;
    Torneo torneoActual;
    Responsable responsableActual;
    Partida partidaActual;
    Club clubActual;
    Gerente gerenteActual;
    
    public LigaAjedrez() {
        usuarios = new ArrayList<Usuario>();
        clubes = new ArrayList<Club>();
        torneos = new ArrayList<Torneo>();
        gerentes = new ArrayList<Gerente>();
        
        Jugador j1 = new Jugador();
        j1.setNombre("Edgar");
        j1.setContraseña("123");
        j1.setNacimiento("24/11/1996");
        
        Jugador j2 = new Jugador();
        j2.setNombre("Vicente");
        j2.setContraseña("456");
        j2.setNacimiento("7/11/1998");
        
        Jugador j3 = new Jugador();
        j3.setNombre("Gerard");
        j3.setContraseña("789");
        j2.setNacimiento("7/11/2000");
        
        Administrador admin = new Administrador();
        admin.setNombre("admin");
        admin.setContraseña("admin");
        
        usuarios.add(j1);
        usuarios.add(j2);
        usuarios.add(j3);
        usuarios.add(admin);
        
        Gerente g1 = new Gerente();
        g1.setNombre("ElPepe");
        g1.setNomina(1500);
        g1.setIrpf(5);
        
        Gerente g2 = new Gerente();
        g2.setNombre("Jopepe");
        g2.setNomina(3000);
        g2.setIrpf(15);
        
        Gerente g3 = new Gerente();
        g3.setNombre("Pipape");
        g3.setNomina(4500);
        g3.setIrpf(20);
        
        gerentes.add(g1);
        gerentes.add(g2);
        gerentes.add(g3);
        
        
        Club c1 = new Club();
        c1.setNombre("ValenciaCA");
        c1.setCuota(10);
        c1.setSede("Valencia");
        c1.addJugador(j1);
        j1.setClub(c1);
        c1.addJugador(j3);
        j3.setClub(c1);
        c1.setGerente(g1);
        g1.setClub(c1);
        
        Club c2 = new Club();
        c2.setNombre("MadridCA");
        c2.setCuota(15);
        c2.setSede("Madrid");
        c2.addJugador(j2);
        j2.setClub(c2);
        c2.setGerente(g2);
        g2.setClub(c2);
        
        clubes.add(c1);
        clubes.add(c2);
        
        Torneo t1 = new Torneo();
        t1.setNombre("Liga Endesa");
        t1.addJugador(j1);
        j1.addTorneo(t1);
        t1.addJugador(j2);
        j2.addTorneo(t1);
        t1.addClub(c1);
        c1.addTorneo(t1);
        t1.addClub(c2);
        c2.addTorneo(t1);
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
        p1.setGanador(1);
        p1.setFecha("1/1/2020");
        p1.setDuracion(340);
        p1.setSede("Madrid");
    }
    
    //FUNCION DE LOGIN
    public String login(String n, String c) {
        String respuesta = "Nadie";
        
        for(int i=0; i<usuarios.size();i++) {
            if (usuarios.get(i).login(n, c)) {
                respuesta = usuarios.get(i).tipo();
                if (respuesta.equals("Jugador")) {
                    jugadorActual = (Jugador)usuarios.get(i);
                }
            } else if (usuarios.get(i).getNombre().equals(n)) {
                respuesta = "Contraseña Incorrecta";
            }
        }
        
        return respuesta;
    }
    
    //FUNCION PARA REGISTRAR UN NUEVO JUGADOR
    public boolean registrarJugador(String nombre, String contrasenya, String nacimiento, String club) {
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
                    int anyo = Integer.parseInt(nacimiento.split("/")[2]);
                    
                    if (anyo>(2020-16)) {
                        j.setResponsable(responsableActual);
                        responsableActual=null;
                        if (j.getResponsable()==null) {
                            System.out.println("Debes registrar un responsable primero");
                            j=null;
                        } else {
                            usuarios.add(j);
                            clubes.get(i).addJugador(j);
                        }
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
    
    public ArrayList<String> listaGerentes() {
        ArrayList<String> lista = new ArrayList<String>();
        
        for (int i=0; i<gerentes.size(); i++) {
            lista.add(gerentes.get(i).getNombre());
        }
        
        return lista;
    }
    
    //FUNCION PARA DEVOLVER UN LISTA CON LOS NOMBRES DE TODOS LOS CLUBES
    public ArrayList<String> listaClubesHistorico() {
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList <Club> historico = jugadorActual.historicoClubes();
        
        for (int i=0; i<historico.size(); i++) {
            lista.add(historico.get(i).getNombre());
        }
        
        return lista;
    }
    
    //FUNCION PARA DEVOLVER UN LISTA CON TODOS LOS PARTIDOS DEL JUGADOR ACTUAL
    public ArrayList<String> listaPartidasJugador(){
        return jugadorActual.partidaTorneo(torneoActual);
    }
    
    //FUNCION PARA DEVOLVER UN LISTA CON TODOS LOS PARTIDOS DE UN TORNEO
    public ArrayList<String> listaPartidasTorneo(){
        return torneoActual.getNombrePartidas();
    }
    
    public ArrayList<String> listaJugadoresTorneo(){
        return torneoActual.getNombreJugadores();
    }
    
    //FUNCION PARA DEVOLVER UN LISTA CON LOS NOMBRES DE TODOS LOS CLUBES
    public ArrayList<String> listaGerentesLibres() {
        ArrayList<String> lista = new ArrayList<String>();
        
        if (clubActual!=null) {
            if (clubActual.getGerente()!=null) {
                lista.add(clubActual.getGerente().getNombre());
            } else {
                lista.add("NADIE");
            }
        }
        
        for (int i=0; i<gerentes.size(); i++) {
            if (gerentes.get(i).libre()) {
                lista.add(gerentes.get(i).getNombre());
            }
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
    
    //FUNCION QUE DEVUELVE UNA LISTA CON TODOS LOS JUGADORES
    public ArrayList<String> listaJugadores() {
        
        ArrayList<String> lista = new ArrayList<String>();
        
        for (int i=0; i<usuarios.size(); i++) {
            if (usuarios.get(i).tipo().equals("Jugador")) {
                lista.add(usuarios.get(i).getNombre());
            }
        }
        
        return lista;
    }
    
    //FUNCION QUE DEVUELVE UNA LISTA CON TODOS LOS JUGADORES
    public ArrayList<String> listaSedesTorneo() {
        return torneoActual.getSedes();
    }
    
    public ArrayList<String> listaClubesGerente() {
        ArrayList <Club> c = gerenteActual.getHistoricoClubes();
        ArrayList salida = new ArrayList();
        
        for (int i=0; i<c.size(); i++) {
            salida.add(c.get(i).getNombre());
        }
        
        return salida;
    }
    
    public ArrayList<Float> listaNominasGerente() {
        return gerenteActual.getHistoricoNominas();
    }
    
    public ArrayList<Float> listaIrpfGerente() {
        return gerenteActual.getHistoricoIrpf();
    }
    
    
    //FUNCION QUE DEVUELVE UN CLUB PASANDOLE EL NOMBRE
    private Club clubPorNombre(String nombre) {
        Club c = null;
        
        for (int i=0; i<clubes.size();i++) {
            if (clubes.get(i).esClub(nombre)) {
                c = clubes.get(i);
            }
        }
        
        return c;
    }
    
    //FUNCION PARA SELECCIONAR UN JUGADOR DADO EL NOMBRE DE ESTE
    public void setJugadorActual(String n){
        for (int i=0; i<usuarios.size();i++) {
            if (usuarios.get(i).esUsuario(n)) {
                jugadorActual = (Jugador)usuarios.get(i);
            }
        }
    }
    
    //FUNCION PARA SELECCIONAR UN TORNEO DADO EL NOMBRE DE ESTE
    public void setTorneoActual(String t){
        
        for (int i=0; i<torneos.size();i++) {
            if (torneos.get(i).esTorneo(t)) {
                torneoActual = torneos.get(i);
            }
        }
    }
    
    //FUNCION PARA SELECCIONAR UNA PARTIDA DADO EL NOMBRE DE ESTA
    public void setPartidaActual(String p){
        for (int i=0; i<torneoActual.getPartidas().size();i++) {
            if (torneoActual.getPartidas().get(i).esPartida(p)) {
                partidaActual = torneoActual.getPartidas().get(i);
            }
        }
    }
    
    
    public void setClubActual(String c){
        for (int i=0; i<clubes.size();i++) {
            if (clubes.get(i).esClub(c)) {
                clubActual = clubes.get(i);
            }
        }
    }
    
    public void setGerenteActual(String g){
        for (int i=0; i<gerentes.size();i++) {
            if (gerentes.get(i).esGerente(g)) {
                gerenteActual = gerentes.get(i);
            }
        }
    }
    
    //FUNCION PARA SABER SI UN JUGADOR ESTA INSCRITO EN UN TORNEO
    public boolean inscrito() {
        return jugadorActual.inscrito(torneoActual);
    }
    
    //FUNCION PARA INSCRIBIR UN JUGADOR EN UN TORNEO
    public void inscribirJugador() {
        torneoActual.addJugador(jugadorActual);
        jugadorActual.addTorneo(torneoActual);
    }
    
    //FUNCION PARA CAMBIAR EL CLUB DEL JUGADOR ACTUAL
    public float cambiarClub(String club)
    {
        if (jugadorActual.getClub()!=null) {
            jugadorActual.getClub().quitarJugador(jugadorActual);
        }
        jugadorActual.setClub(clubPorNombre(club));
        clubPorNombre(club).addJugador(jugadorActual);
        
        return clubPorNombre(club).getCuota();
    }
    
    public void salirJugador() {
        jugadorActual = null;
    }
    
    public void salirPartida() {
        partidaActual = null;
    }
    
    public void salirClub() {
        clubActual = null;
    }
    
    public void salirGerente() {
        gerenteActual = null;
    }
    
    public String datosPartida() {
        String local = partidaActual.getJ_local().getNombre();
        String visitante = partidaActual.getJ_visitante().getNombre();
        String ganador = partidaActual.getGanador();
        String fecha = partidaActual.getFecha();
        int duracion = partidaActual.getDuracion();
        String sede = partidaActual.getSede();
        
        return local+"-"+visitante+"-"+ganador+"-"+fecha+"-"+duracion+"-"+sede;
    }
    
    public String datosClub() {
        String nombre = clubActual.getNombre();
        String cuota = clubActual.getCuota()+"";
        String sede = clubActual.getSede();
        
        return nombre+"-"+cuota+"-"+sede;
    }
    
    public String datosJugador() {
        String nombre = jugadorActual.getNombre();
        String contrasena = jugadorActual.getContraseña();
        String club;
        
        if (jugadorActual.getClub()!=null) {
            club = jugadorActual.getClub().getNombre();
        } else {
            club = " ";
        }
        
        String fecha = jugadorActual.getNacimiento();
        
        return nombre+"-"+contrasena+"-"+club+"-"+fecha;
    }
    
    public String datosGerente() {
        String nombre = gerenteActual.getNombre();
        String nomina = gerenteActual.getNomina()+"";
        String irpf = gerenteActual.getIrpf()+"";
        String club;
        
        if (gerenteActual.getClub() == null) {
            club = "LIBRE";
        } else {
            club = gerenteActual.getClub().getNombre();
        }
        
        return nombre+"-"+nomina+"-"+irpf+"-"+club;
    }
    
    public boolean esAdmin() {
        boolean respuesta;
        if (jugadorActual==null) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        
        return respuesta;
    }
    
    public void cambiarDatosPartida(String d) {
        
        String[] datos = d.split("-");
        Jugador j = partidaActual.getJ_local();
        j.eliminarPartida(partidaActual);
        setJugadorActual(datos[0]);
        jugadorActual.addPartida(partidaActual);
        partidaActual.setJ_local(jugadorActual);
        
        j = partidaActual.getJ_visitante();
        j.eliminarPartida(partidaActual);
        setJugadorActual(datos[1]);
        jugadorActual.addPartida(partidaActual);
        partidaActual.setJ_visitante(jugadorActual);
        
        salirJugador();
        partidaActual.setGanador(Integer.parseInt(datos[2]));
        partidaActual.setFecha(datos[3]);
        partidaActual.setDuracion(Integer.parseInt(datos[4]));
        partidaActual.setSede(datos[5]);
    }
    
    public void cambiarDatosClub(String d) {
        String[] datos = d.split("-");
        
        clubActual.setNombre(datos[0]);
        clubActual.setCuota(Float.parseFloat(datos[1]));
        clubActual.setSede(datos[2]);
        
        if (clubActual.getGerente()!=null) {
            clubActual.getGerente().setClub(null);
            clubActual.setGerente(null);
        }
        
        for (int i=0; i<gerentes.size(); i++) {
            if (gerentes.get(i).getNombre().equals(datos[3])) {
                gerentes.get(i).setClub(clubActual);
                clubActual.setGerente(gerentes.get(i));
            }
        }
        
        salirClub();
    }
    
    public void cambiarDatosGerente(String d) {
        String[] datos = d.split("-");
        
        gerenteActual.setNombre(datos[0]);
        gerenteActual.setNomina(Float.parseFloat(datos[1]));
        gerenteActual.setIrpf(Float.parseFloat(datos[2]));
        
        salirGerente();
    }
    
    public boolean hayPartida() {
        boolean respuesta;
        
        if (partidaActual==null) {
            respuesta = false;
        } else {
            respuesta = true;
        }
        
        return respuesta;
    }
    
    public boolean hayClub() {
        boolean respuesta;
        
        if (clubActual==null) {
            respuesta = false;
        } else {
            respuesta = true;
        }
        
        return respuesta;
    }
    
    public boolean hayGerente() {
        boolean respuesta;
        
        if (gerenteActual==null) {
            respuesta = false;
        } else {
            respuesta = true;
        }
        
        return respuesta;
    }
    
    public void nuevaPartida(String d) {
        String[] datos = d.split("-");
        partidaActual = new Partida();
        
        setJugadorActual(datos[0]);
        jugadorActual.addPartida(partidaActual);
        partidaActual.setJ_local(jugadorActual);
     
        setJugadorActual(datos[1]);
        jugadorActual.addPartida(partidaActual);
        partidaActual.setJ_visitante(jugadorActual);
        
        salirJugador();
        partidaActual.setGanador(Integer.parseInt(datos[2]));
        partidaActual.setFecha(datos[3]);
        partidaActual.setDuracion(Integer.parseInt(datos[4]));
        partidaActual.setSede(datos[5]);
        partidaActual.setTorneo(torneoActual);
        torneoActual.addPartida(partidaActual);
    }
    
    public void nuevoClub(String d) {
        String[] datos = d.split("-");
        clubActual = new Club();
        
        clubActual.setNombre(datos[0]);
        clubActual.setCuota(Float.parseFloat(datos[1]));
        clubActual.setSede(datos[2]);
        
        for (int i=0; i<gerentes.size(); i++) {
            if (gerentes.get(i).getNombre().equals(datos[3])) {
                gerentes.get(i).setClub(clubActual);
                clubActual.setGerente(gerentes.get(i));
            }
        }
        
        clubes.add(clubActual);
        salirClub();
    }
    
    public void nuevoGerente(String d) {
        String[] datos = d.split("-");
        gerenteActual = new Gerente();
        
        gerenteActual.setNombre(datos[0]);
        gerenteActual.setNomina(Float.parseFloat(datos[1]));
        gerenteActual.setIrpf(Float.parseFloat(datos[2]));
        
        gerentes.add(gerenteActual);
        salirGerente();
    }
    
    public void eliminarPartida(String partida) {
        setPartidaActual(partida);
        
        partidaActual.getJ_local().eliminarPartida(partidaActual);
        partidaActual.getJ_visitante().eliminarPartida(partidaActual);
        torneoActual.eliminarPartida(partidaActual);
        salirPartida();
    }
    
    public void eliminarClub(String club) {
        setClubActual(club);
        clubActual.eliminarJugadores();
        clubActual.salirTorneos();
        clubActual.getGerente().setClub(null);
        clubes.remove(clubActual);
        
        salirClub();
    }
    
    public void eliminarGerente(String gerente) {
        setGerenteActual(gerente);
        gerenteActual.getClub().setGerente(null);
        gerentes.remove(gerenteActual);
        
        salirGerente();
    }
    
    private boolean leerDatos(String fich) {
        boolean leido = false;
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivo = new File (fich);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String linea;
            while((linea = br.readLine())!= null){
                
                
                
                }
            
        }
        catch(Exception e){
                e.printStackTrace();
        }finally{
            try{
                if(fr!=null)
                    fr.close();
            }
            catch(Exception e){
                e.printStackTrace();
        }
        
        return leido;
    }
}
}
