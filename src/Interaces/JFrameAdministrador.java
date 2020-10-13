/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interaces;

/**
 *
 * @author gerar
 */
public class JFrameAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form JFrameAdministrador
     */
    
    JFrameJugador jugador;
    JFrameClubes clubes;
    JFrameTorneo torneos;
    JFrameInfo info;
    JFrameLogin login;
    public JFrameAdministrador(JFrameLogin l) {
        initComponents();
        login = l;
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

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        EtiquetaAdministrador.setText("Administrador del Sistema");

        botonJugadores.setText("Jugadores");
        botonJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugadoresActionPerformed(evt);
            }
        });

        botonClubes.setText("Clubes");
        botonClubes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClubesActionPerformed(evt);
            }
        });

        botonTorneos.setText("Torneos");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(EtiquetaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(Salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonClubes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonTorneos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(EtiquetaAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonJugadores)
                .addGap(50, 50, 50)
                .addComponent(botonClubes)
                .addGap(43, 43, 43)
                .addComponent(botonTorneos)
                .addGap(77, 77, 77)
                .addComponent(Salir)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

    private void botonJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugadoresActionPerformed
        this.setVisible(false);
        jugador = new JFrameJugador(login);
        jugador.setVisible(true);
    }//GEN-LAST:event_botonJugadoresActionPerformed

    private void botonClubesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClubesActionPerformed
         this.setVisible(false);
         clubes = new JFrameClubes(info);
         clubes.setVisible(true);
    }//GEN-LAST:event_botonClubesActionPerformed

    private void botonTorneosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTorneosActionPerformed
        this.setVisible(false);
        torneos = new JFrameTorneo(jugador);
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
