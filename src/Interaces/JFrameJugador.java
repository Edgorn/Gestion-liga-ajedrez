/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interaces;

import javax.swing.JOptionPane;

/**
 *
 * @author vicen
 */
public class JFrameJugador extends javax.swing.JFrame {

    JFrameLogin login;
    
    public JFrameJugador(JFrameLogin l) {
        login = l;
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

        jLabelUsuario = new javax.swing.JLabel();
        jLabelNomUsuario = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButtonInscr = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuModificar = new javax.swing.JMenu();
        jMenuItemJugador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelUsuario.setText("Usuario: ");

        jLabelNomUsuario.setText("Pepito");

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonInscr.setText("Inscribirse a Torneo");
        jButtonInscr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInscrActionPerformed(evt);
            }
        });

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
                .addGap(43, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonInscr)
                        .addGap(11, 11, 11)
                        .addComponent(jButtonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNomUsuario)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelNomUsuario))
                .addGap(37, 37, 37)
                .addComponent(jButtonInscr)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonInscrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInscrActionPerformed
        Object selector = JOptionPane.showInputDialog(this, "Seleccione torneo",
                "Inscripción a torneo", JOptionPane.QUESTION_MESSAGE, null,
                new Object[] {"Torneo 1", "Torneo 2", "Torneo 3"}, "Torneo 1");
        if (selector != null){
            JFrameTorneo torneo = new JFrameTorneo(this);
            this.setVisible(false);
            torneo.setVisible(true);
        }
    }//GEN-LAST:event_jButtonInscrActionPerformed

    private void jMenuItemJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJugadorActionPerformed
        JFrameEditJugador edit = new JFrameEditJugador(this);
        this.setVisible(false);
        edit.setVisible(true);
    }//GEN-LAST:event_jMenuItemJugadorActionPerformed

    private void jMenuModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModificarActionPerformed
        
    }//GEN-LAST:event_jMenuModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInscr;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelNomUsuario;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemJugador;
    private javax.swing.JMenu jMenuModificar;
    // End of variables declaration//GEN-END:variables
}
