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
 * @author edgar
 */
public class JFrameEditGerentes extends javax.swing.JFrame {

    /**
     * Creates new form JFrameAdminGerentes
     */
    
    JFrame frame;
    LigaAjedrez liga;
    
    public JFrameEditGerentes(JFrame f, LigaAjedrez la) {
        initComponents();
        frame = f;
        liga = la;
        
        if(liga.hayGerente()) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListNominas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListClubes = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListIrpf = new javax.swing.JList<>();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldNomina = new javax.swing.JTextField();
        jTextFieldIrpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldClub = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nomina:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("IRPF:");

        jListNominas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jScrollPane1.setViewportView(jListNominas);

        jListClubes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(jListClubes);

        jListIrpf.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(jListIrpf);

        jTextFieldNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextFieldNomina.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextFieldIrpf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldIrpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIrpfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("HISTORICO CLUBES");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("HISTORICO NOMINAS");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("HISTORICO IRPF");

        jButtonModificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonAtras.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonAtras.setText("ATRAS");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Club:");

        jTextFieldClub.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldClub.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonModificar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAtras))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31))))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jTextFieldNomina)
                    .addComponent(jTextFieldIrpf)
                    .addComponent(jTextFieldClub))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIrpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonAtras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIrpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIrpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIrpfActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        String nombre = jTextFieldNombre.getText();
        String nomina = jTextFieldNomina.getText();
        String irpf = jTextFieldIrpf.getText();
        
        if (liga.hayGerente()) {
            liga.cambiarDatosGerente(nombre+"-"+nomina+"-"+irpf);
        } else {
            liga.nuevoGerente(nombre+"-"+nomina+"-"+irpf);
        }
        
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        liga.salirGerente();
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        anyadirClubes();
        anyadirNominas();
        anyadirIrpf();
    }//GEN-LAST:event_formWindowActivated

    private void llenarDatos() {
        String[] datos = liga.datosGerente().split("-");
        
        jTextFieldNombre.setText(datos[0]);
        jTextFieldNomina.setText(datos[1]);
        jTextFieldIrpf.setText(datos[2]);
        jTextFieldClub.setText(datos[3]);
    }
    
    private void anyadirClubes() {
        ArrayList<String> clubes = liga.listaClubesGerente();
        String [] lista = new String[clubes.size()];
        
        for(int i=0;i<clubes.size();i++)
            lista[i]=clubes.get(i);
        jListClubes.setListData(lista);
    }
    
    private void anyadirNominas() {
        ArrayList <Float> nominas = liga.listaNominasGerente();
        String [] lista = new String[nominas.size()];
        for(int i=0;i<nominas.size();i++)
            lista[i]=nominas.get(i)+"";
        jListNominas.setListData(lista);
    }
    
    private void anyadirIrpf() {
        ArrayList <Float> irpf = liga.listaIrpfGerente();
        String [] lista = new String[irpf.size()];
        for(int i=0;i<irpf.size();i++)
            lista[i]=irpf.get(i)+"";
        jListIrpf.setListData(lista);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jListClubes;
    private javax.swing.JList<String> jListIrpf;
    private javax.swing.JList<String> jListNominas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldClub;
    private javax.swing.JTextField jTextFieldIrpf;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNomina;
    // End of variables declaration//GEN-END:variables
}
