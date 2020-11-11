/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interaces;

import Modelo.LigaAjedrez;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author gerar
 */
public class JFramePartidas extends javax.swing.JFrame {

    /**
     * Creates new form JFrameTorneo
     */
    JFrame frame;
    LigaAjedrez liga;
    int anyo = 2020;
    
    
    public JFramePartidas(JFrame t, LigaAjedrez la) {
        initComponents();
        frame = t;
        liga = la;
        
        llenarListas();
        
        if (liga.hayPartida()) {
            llenarDatos();
        } else {
            jButtonModificar.setText("CREAR");
        }
        
        
        if (!la.esAdmin()) {
            bloquearModificaciones();
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

        botonAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxLocal = new javax.swing.JComboBox<>();
        jComboBoxVisitante = new javax.swing.JComboBox<>();
        jComboBoxGanador = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxAnyo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxSedes = new javax.swing.JComboBox<>();
        jButtonModificar = new javax.swing.JButton();
        jTextFieldMinutos = new javax.swing.JTextField();
        jTextFieldSegundos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        botonAtras.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        botonAtras.setText("ATRAS");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("VS");
        jLabel1.setAutoscrolls(true);

        jComboBoxLocal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jComboBoxLocal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxLocalItemStateChanged(evt);
            }
        });

        jComboBoxVisitante.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jComboBoxVisitante.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxVisitanteItemStateChanged(evt);
            }
        });

        jComboBoxGanador.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("GANADOR:");

        jComboBoxDia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("/");

        jComboBoxMes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMesItemStateChanged(evt);
            }
        });
        jComboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("FECHA:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("/");

        jComboBoxAnyo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBoxAnyo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAnyoItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("DURACION DE LA PARTIDA:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText(":");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("SEDE DE LA PARTIDA:");

        jComboBoxSedes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jButtonModificar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jTextFieldMinutos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jTextFieldSegundos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(134, 134, 134))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jTextFieldMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxSedes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxSedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        liga.salirPartida();
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void jComboBoxMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMesItemStateChanged
        totalDias();
    }//GEN-LAST:event_jComboBoxMesItemStateChanged

    private void jComboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMesActionPerformed

    private void jComboBoxAnyoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAnyoItemStateChanged
        totalDias();
    }//GEN-LAST:event_jComboBoxAnyoItemStateChanged

    private void jComboBoxLocalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxLocalItemStateChanged
        llenarGanador();
    }//GEN-LAST:event_jComboBoxLocalItemStateChanged

    private void jComboBoxVisitanteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxVisitanteItemStateChanged
        llenarGanador();
    }//GEN-LAST:event_jComboBoxVisitanteItemStateChanged

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        String local = jComboBoxLocal.getSelectedItem()+"";
        String visitante = jComboBoxVisitante.getSelectedItem()+"";
        
        int ganador;
        
        if (local.equals(jComboBoxGanador.getSelectedItem()+"")) {
            ganador = 1;
        } else if (visitante.equals(jComboBoxGanador.getSelectedItem()+"")) {
            ganador = 2;
        } else {
            ganador = 0;
        }
        
        int dia = jComboBoxDia.getSelectedIndex()+1;
        int mes = jComboBoxMes.getSelectedIndex()+1;
        int any = Integer.parseInt(jComboBoxAnyo.getSelectedItem()+"");
        
        String fecha = dia+"/"+mes+"/"+any;
        int segundos;
        int minutos;
        
        try {
            segundos = Integer.parseInt(jTextFieldSegundos.getText());
            minutos = Integer.parseInt(jTextFieldMinutos.getText());
        } catch (Exception e) {
            segundos = 0;
            minutos = 0;
        }
        
        
        int duracion = segundos + (minutos*60);
        String sede = jComboBoxSedes.getSelectedItem()+"";
        
        if (local.equals(visitante)) {
            System.out.println("Los dos jugadores deben ser distintos");
        } else {
            
            if (liga.hayPartida()) {
                liga.cambiarDatosPartida(local+"-"+visitante+"-"+ganador+"-"+fecha+"-"+duracion+"-"+sede);
            } else {
                liga.nuevaPartida(local+"-"+visitante+"-"+ganador+"-"+fecha+"-"+duracion+"-"+sede);
            }
            liga.salirPartida();
            this.setVisible(false);
            frame.setVisible(true);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    public void llenarDatos() {
        String[] datos = liga.datosPartida().split("-");
        String[] fecha = datos[3].split("/");
        int duracion = Integer.parseInt(datos[4]);
        
        jComboBoxLocal.setSelectedItem(datos[0]);
        jComboBoxVisitante.setSelectedItem(datos[1]);
        jComboBoxDia.setSelectedItem(fecha[0]);
        jComboBoxMes.setSelectedIndex(Integer.parseInt(fecha[1])-1);
        jComboBoxAnyo.setSelectedItem(fecha[2]);
        jTextFieldMinutos.setText(duracion/60+"");
        jTextFieldSegundos.setText(duracion%60+"");
        jComboBoxSedes.setSelectedItem(datos[5]);
        
        llenarGanador();
        
        if(datos[2].equals("local")) {
            jComboBoxGanador.setSelectedItem(datos[0]);
        } else if (datos[2].equals("visitante")) {
            jComboBoxGanador.setSelectedItem(datos[1]);
        } else {
            jComboBoxGanador.setSelectedItem("NADIE");
        }
    }
    
    public void llenarGanador() {
        jComboBoxGanador.removeAllItems();
        
        jComboBoxGanador.addItem("NADIE");
        jComboBoxGanador.addItem(jComboBoxLocal.getSelectedItem()+"");
        jComboBoxGanador.addItem(jComboBoxVisitante.getSelectedItem()+"");
    }
    
    public void bloquearModificaciones() {
        jComboBoxLocal.setEnabled(false);
        jComboBoxVisitante.setEnabled(false);
        jComboBoxGanador.setEnabled(false);
        jComboBoxDia.setEnabled(false);
        jComboBoxMes.setEnabled(false);
        jComboBoxAnyo.setEnabled(false);
        jTextFieldMinutos.setEnabled(false);
        jTextFieldSegundos.setEnabled(false);
        jComboBoxSedes.setEnabled(false);
    }
    
    private void iniciarFecha() {
        for (int i=0; i<20; i++)
            jComboBoxAnyo.addItem((anyo+10)-i+"");
       
        totalDias();
    }
    
    private void totalDias() {
        int mes = jComboBoxMes.getSelectedIndex();
        int any = Integer.parseInt(""+jComboBoxAnyo.getSelectedItem());
        int totalDias = 31;
        
        switch (mes) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                totalDias=31;
                break;
                
            case 3:
            case 5:
            case 8:
            case 10:
                totalDias=30;
                break;
                
            case 1:
                if (any%4==0) {
                    if(any%100==0) {
                        if(any%400==0) {
                            totalDias=29;
                        } else {
                            totalDias=28;
                        }
                    } else {
                        totalDias=29;
                    }
                } else {
                    totalDias=28;
                }
                break;
        }
        
        for (int i = 1; i<=totalDias; i++) {
            jComboBoxDia.addItem(i+"");
        }
    }
    
    private void llenarListas() {
        ArrayList<String> jugadores = liga.listaJugadoresTorneo();
        ArrayList<String> sedes = liga.listaSedesTorneo();
        for (int i=0; i<jugadores.size(); i++) {
            jComboBoxLocal.addItem(jugadores.get(i));
        }
        
        for (int i=0; i<jugadores.size(); i++) {
            jComboBoxVisitante.addItem(jugadores.get(i));
        }
        
        for (int i=0; i<sedes.size(); i++) {
            jComboBoxSedes.addItem(sedes.get(i));
        }
        
        iniciarFecha();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxAnyo;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxGanador;
    private javax.swing.JComboBox<String> jComboBoxLocal;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JComboBox<String> jComboBoxSedes;
    private javax.swing.JComboBox<String> jComboBoxVisitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldMinutos;
    private javax.swing.JTextField jTextFieldSegundos;
    // End of variables declaration//GEN-END:variables
}
