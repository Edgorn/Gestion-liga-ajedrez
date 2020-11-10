/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interaces;

import Modelo.LigaAjedrez;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class JFrameClubes extends javax.swing.JFrame {

    /**
     * Creates new form JFrameClubes
     */
    
    JFrame frame;
    LigaAjedrez liga;
    
    public JFrameClubes(JFrame f, LigaAjedrez la) {
        initComponents();
        frame = f;
        liga = la;
        
        llenarGerentes();
        
        if (liga.hayClub()) {
            llenarDatos();
        } else {
            jButtonModificar.setText("CREAR");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCuota = new javax.swing.JTextField();
        jTextFieldSede = new javax.swing.JTextField();
        jButtonModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxGerentes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAtras.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonAtras.setText("ATRAS");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Cuota:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Sede:");

        jTextFieldNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextFieldCuota.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextFieldSede.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jButtonModificar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Gerente:");

        jComboBoxGerentes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCuota)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldSede)
                            .addComponent(jComboBoxGerentes, 0, 201, Short.MAX_VALUE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxGerentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonAtras))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        liga.salirClub();
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        String nombre = jTextFieldNombre.getText();
        String cuota = jTextFieldCuota.getText();
        String sede = jTextFieldSede.getText();
        String gerente = jComboBoxGerentes.getSelectedItem()+"";
        
        if (liga.hayClub()) {
            liga.cambiarDatosClub(nombre+"-"+cuota+"-"+sede+"-"+gerente);
        } else {
            liga.nuevoClub(nombre+"-"+cuota+"-"+sede+"-"+gerente);
        }
            liga.salirClub();
            this.setVisible(false);
            frame.setVisible(true);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    public void llenarDatos() {
        String[] datos = liga.datosClub().split("-");
        
        jTextFieldNombre.setText(datos[0]);
        jTextFieldCuota.setText(datos[1]);
        jTextFieldSede.setText(datos[2]);
        jComboBoxGerentes.setSelectedItem(datos[3]);
    }
    
    private void llenarGerentes() {
        ArrayList<String> gerentes = liga.listaGerentesLibres();
        
        for (int i=0; i<gerentes.size(); i++) {
            jComboBoxGerentes.addItem(gerentes.get(i));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxGerentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldCuota;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSede;
    // End of variables declaration//GEN-END:variables
}
