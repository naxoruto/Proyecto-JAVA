/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import javax.swing.JOptionPane;

/**
 *
 * @author Vice
 */
public class ArchivoNoEncontradoException extends Exception {
    public ArchivoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
    
    public ArchivoNoEncontradoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}


