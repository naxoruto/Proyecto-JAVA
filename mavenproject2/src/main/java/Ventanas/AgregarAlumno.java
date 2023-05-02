/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import com.mycompany.mavenproject2.Alumno;
import com.mycompany.mavenproject2.AlumnoDeporte;
import com.mycompany.mavenproject2.AlumnoEspecial;
import com.mycompany.mavenproject2.Asistencia;
import com.mycompany.mavenproject2.Colegio;
import java.time.LocalDate;

/**
 *
 * @author cross
 */
public class AgregarAlumno extends javax.swing.JFrame {

    public Colegio colegio;
    public AgregarAlumno(Colegio colegio) {
        initComponents();
        this.colegio = colegio;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Jnombre = new javax.swing.JTextField();
        Jrut = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        Deportista = new javax.swing.JRadioButton();
        deporte = new javax.swing.JTextField();
        Especial = new javax.swing.JRadioButton();
        Normal = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        Jnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JnombreActionPerformed(evt);
            }
        });

        Jrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rut:");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        buttonGroup1.add(Deportista);
        Deportista.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Deportista.setForeground(new java.awt.Color(255, 255, 255));
        Deportista.setText("Deportista");

        buttonGroup1.add(Especial);
        Especial.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Especial.setForeground(new java.awt.Color(255, 255, 255));
        Especial.setText("Asistencia Especial");

        Normal.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Normal.setForeground(new java.awt.Color(255, 255, 255));
        Normal.setText("Niguno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jrut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Jnombre)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(226, 226, 226)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Normal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deporte)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Deportista)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(63, 63, 63))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Especial)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addComponent(Volver)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(Jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Deportista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(Jrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Volver)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Especial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(Normal)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JnombreActionPerformed

    }//GEN-LAST:event_JnombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Integer rut = Integer.valueOf(Jrut.getText());
        Asistencia[] asistNuevo = new Asistencia[193];
        asistNuevo[0] = new Asistencia(true, false, false, false, LocalDate.now());
        if (Deportista.isSelected()){
            AlumnoDeporte alumnoNuevo = new AlumnoDeporte(Jnombre.getText(),rut, asistNuevo, deporte.getText());
            colegio.agregarAlumno(alumnoNuevo);
        }else if(Especial.isSelected()){
            AlumnoEspecial alumnoNuevo = new AlumnoEspecial(Jnombre.getText(),rut, asistNuevo, "true");
            colegio.agregarAlumno(alumnoNuevo);
        }else{
            Alumno alumno = new Alumno(Jnombre.getText(),rut, asistNuevo);
            colegio.agregarAlumno(alumno);
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrutActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed

        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Deportista;
    private javax.swing.JRadioButton Especial;
    private javax.swing.JTextField Jnombre;
    private javax.swing.JTextField Jrut;
    private javax.swing.JRadioButton Normal;
    private javax.swing.JButton Volver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField deporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
