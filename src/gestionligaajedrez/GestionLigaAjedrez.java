package gestionligaajedrez;

import Interaces.JFrameLogin;
import Modelo.LigaAjedrez;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author edgar
 */
public class GestionLigaAjedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LigaAjedrez modelo = new LigaAjedrez();
        JFrameLogin login = new JFrameLogin(modelo);
        
        login.setVisible(true);
    }
    
}
