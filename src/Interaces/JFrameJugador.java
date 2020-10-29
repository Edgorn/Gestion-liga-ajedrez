/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interaces;

import Modelo.LigaAjedrez;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vicen
 */

public class JFrameJugador extends javax.swing.JFrame {

    JFrame login;
    LigaAjedrez liga;
    JFrameEditJugador jugador;
    public JFrameJugador(JFrame l, LigaAjedrez la) {
        login = l;
        liga = la;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jButtonTorneo = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuModificar = new javax.swing.JMenu();
        jMenuItemJugador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonTorneo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonTorneo.setText("Ver Torneos");
        jButtonTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTorneoActionPerformed(evt);
            }
        });

        jMenuBar2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMenuModificar.setText("Modificar");
        jMenuModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModificarActionPerformed(evt);
            }
        });

        jMenuItemJugador.setText("Modificar datos del jugador");
        jMenuItemJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJugadorActionPerformed(evt);
            }
        });
        jMenuModificar.add(jMenuItemJugador);

        jMenuBar2.add(jMenuModificar);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jButtonTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButtonTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTorneoActionPerformed
        String selector = (String)JOptionPane.showInputDialog(this, "Seleccione torneo","Inscripción a torneo", JOptionPane.QUESTION_MESSAGE, null, liga.listaTorneos().toArray(),"Selecciona torneo");
        
        if (selector != null){
            liga.setTorneoActual(selector);
            JFrameTorneo torneo = new JFrameTorneo(this, liga);
            this.setVisible(false);
            torneo.setVisible(true);
        }
    }//GEN-LAST:event_jButtonTorneoActionPerformed

    private void jMenuItemJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJugadorActionPerformed
        JFrameEditJugador edit = new JFrameEditJugador(this, liga);
        this.setVisible(false);
        edit.setVisible(true);
    }//GEN-LAST:event_jMenuItemJugadorActionPerformed

    private void jMenuModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModificarActionPerformed
        
    }//GEN-LAST:event_jMenuModificarActionPerformed


    public void setClubJugador(String setClub)
    {
        jugador.setClubJugador(setClub);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonTorneo;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemJugador;
    private javax.swing.JMenu jMenuModificar;
    // End of variables declaration//GEN-END:variables
}
