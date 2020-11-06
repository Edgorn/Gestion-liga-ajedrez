/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interaces;

import Modelo.LigaAjedrez;
import javax.swing.JFrame;

/**
 *
 * @author gerar
 */
public class JFrameAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form JFrameAdministrador
     */
    
    JFrame frame;
    LigaAjedrez liga;
    
    public JFrameAdministrador(JFrame l, LigaAjedrez la) {
        initComponents();
        frame = l;
        liga = la;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        EtiquetaAdministrador = new javax.swing.JLabel();
        botonJugadores = new javax.swing.JButton();
        botonClubes = new javax.swing.JButton();
        botonTorneos = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Salir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        EtiquetaAdministrador.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        EtiquetaAdministrador.setText("ADMINISTRADOR DEL SISTEMA");

        botonJugadores.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonJugadores.setText("JUGADORES");
        botonJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugadoresActionPerformed(evt);
            }
        });

        botonClubes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonClubes.setText("CLUBES");
        botonClubes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClubesActionPerformed(evt);
            }
        });

        botonTorneos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonTorneos.setText("TORNEOS");
        botonTorneos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTorneosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(botonJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(botonClubes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(botonTorneos, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EtiquetaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(EtiquetaAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonClubes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(botonTorneos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(Salir)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

    private void botonJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugadoresActionPerformed
        /*this.setVisible(false);
        jugador = new JFrameAdminJugadores(this);
        jugador.setVisible(true);*/
    }//GEN-LAST:event_botonJugadoresActionPerformed

    private void botonClubesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClubesActionPerformed
         /*this.setVisible(false);
         clubes = new JFrameAdminClubes(this);
         clubes.setVisible(true);*/
    }//GEN-LAST:event_botonClubesActionPerformed

    private void botonTorneosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTorneosActionPerformed
        JFrameAdminTorneos torneos = new JFrameAdminTorneos(this, liga);
        this.setVisible(false);
        torneos.setVisible(true);
    }//GEN-LAST:event_botonTorneosActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaAdministrador;
    private javax.swing.JButton Salir;
    private javax.swing.JButton botonClubes;
    private javax.swing.JButton botonJugadores;
    private javax.swing.JButton botonTorneos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
