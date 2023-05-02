/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import com.mycompany.mavenproject2.Alumno;
import com.mycompany.mavenproject2.Asistencia;
import com.mycompany.mavenproject2.Colegio;
import java.time.LocalDate;
import java.util.HashMap;

/**
 *
 * @author cross
 */
public class ModificarAsistencia extends javax.swing.JFrame {

    public Colegio colegio;
    public ModificarAsistencia(Colegio colegio) {
        initComponents();
        this.colegio = colegio;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jDia = new javax.swing.JSpinner();
        jMes = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btModificar = new javax.swing.JButton();
        Jrut = new javax.swing.JTextField();
        btVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        chkPresente = new javax.swing.JCheckBox();
        chkAusente = new javax.swing.JCheckBox();
        chkAusJus = new javax.swing.JCheckBox();
        chkRetAnt = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Día");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mes");

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btVolver.setText("Volver");
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rut");

        buttonGroup1.add(chkPresente);
        chkPresente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        chkPresente.setForeground(new java.awt.Color(255, 255, 255));
        chkPresente.setText("Presente");

        buttonGroup1.add(chkAusente);
        chkAusente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        chkAusente.setForeground(new java.awt.Color(255, 255, 255));
        chkAusente.setText("Ausente");

        buttonGroup1.add(chkAusJus);
        chkAusJus.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        chkAusJus.setForeground(new java.awt.Color(255, 255, 255));
        chkAusJus.setText("Ausencia Justificada");
        chkAusJus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAusJusActionPerformed(evt);
            }
        });

        buttonGroup1.add(chkRetAnt);
        chkRetAnt.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        chkRetAnt.setForeground(new java.awt.Color(255, 255, 255));
        chkRetAnt.setText("Retiro Anticipado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jrut, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkAusJus)
                            .addComponent(chkRetAnt)
                            .addComponent(chkPresente)
                            .addComponent(chkAusente))))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btVolver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btModificar, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addComponent(chkPresente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAusente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAusJus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkRetAnt)
                    .addComponent(btModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVolver)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVolverActionPerformed

    private void chkAusJusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAusJusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAusJusActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        int rut = Integer.parseInt(Jrut.getText());
        HashMap<Integer, Alumno> alumnos = colegio.getalumnos();
            Alumno alumno = colegio.mostrarAlumno(rut);
            int dia = (int)jDia.getValue();
            int mes = (int)jMes.getValue();
            LocalDate fecha = LocalDate.of(2023, mes, dia);
            chkPresente.setActionCommand("Presente");
            chkAusente.setActionCommand("Ausente");
            chkAusJus.setActionCommand("Ausencia Justificada");
            chkRetAnt.setActionCommand("Retiro Anticipado");
            Asistencia[] asist = alumno.getAsistencias();
            boolean comprobar = asist[0].modificarAsistencia(alumno, fecha, buttonGroup1.getSelection().getActionCommand());
            if (comprobar == false){
                for (int i = 0; i < asist.length; i++){
                    if (alumno.getAsistencias()[i] == null){
                        if (buttonGroup1.getSelection().getActionCommand().equals("Presente")){
                            alumno.getAsistencias()[i] = new Asistencia(true, false, false, false, fecha);
                        }
                        if (buttonGroup1.getSelection().getActionCommand().equals("Ausente")){
                            alumno.getAsistencias()[i] = new Asistencia(false, true, false, false, fecha);
                        }
                        if (buttonGroup1.getSelection().getActionCommand().equals("Ausencia Justificada")){
                            alumno.getAsistencias()[i] = new Asistencia(false, false, false, true, fecha);
                        }
                        if (buttonGroup1.getSelection().getActionCommand().equals("Retiro Anticipado")){
                            alumno.getAsistencias()[i] = new Asistencia(false, false, true, false, fecha);
                        }
                        
                        alumno.getAsistencias()[i].setFecha(fecha);
                        break;
                    }    
                }
            }
        this.dispose();
    }//GEN-LAST:event_btModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jrut;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkAusJus;
    private javax.swing.JCheckBox chkAusente;
    private javax.swing.JCheckBox chkPresente;
    private javax.swing.JCheckBox chkRetAnt;
    private javax.swing.JSpinner jDia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jMes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
