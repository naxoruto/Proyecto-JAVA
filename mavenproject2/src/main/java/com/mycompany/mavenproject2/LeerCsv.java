/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class LeerCsv {
    
    private BufferedReader lector;
    private String linea;
    private String partes[] = null;
    private Colegio nuevoColegio = new Colegio();
    
    public void leerArchivo(String nombreArchivo){
        try{
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while((linea = lector.readLine()) != null){
                partes = linea.split(",");
                mapear();
            }
            lector.close();
            linea= null;
            lector= null;     
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    private void mapear(){
        String nombre = partes[0];
        String rut = partes[1];
        String ult = partes[2];
        Integer ruti = Integer.valueOf(rut);
        int ulti = Integer.parseInt(ult);
        
        LocalDate fecha = LocalDate.now();
        Asistencia[] asistencia = new Asistencia[ulti];
        
        for (int i = 3; i< partes.length; i=i+3){
            String asisti = partes[i];
            int asist = Integer.parseInt(asisti);
            if (asist == 1){
                asistencia[0] = new Asistencia(true, false, false, false, fecha);
                
            }
            if (asist == 2){
            }
            if (asist == 3){
            }
            if (asist == 4){
            }
            
            String mesi = partes[i+1];
            String diai = partes[i+2];
            int mes = Integer.parseInt(mesi);
            int dia = Integer.parseInt(diai);
            fecha = LocalDate.of(2023, mes, dia);
            asistencia[0].setFecha(fecha);
        }
        
        Alumno nuevoAlumno = new Alumno(nombre, ruti, ulti, asistencia);
        nuevoColegio.agregarAlumno(nuevoAlumno);
    }

    public Colegio getColegio(){
        return nuevoColegio;
    }
}
