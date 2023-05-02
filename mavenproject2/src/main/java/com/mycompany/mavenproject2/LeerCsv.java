/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.exit;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class LeerCsv {
    
    private BufferedReader lector;
    private String linea;
    private String partes[] = null;
    private Colegio nuevoColegio;
    
    

    public LeerCsv(Colegio nuevoColegio) {
        this.nuevoColegio = nuevoColegio;
    }
    
    
    
    public void leerArchivo(String recibirDatos) throws  FileNotFoundException,NumberFormatException, IOException{
        
        recibirDatos = "Libro1.csv";

        
        lector = new BufferedReader(new FileReader(recibirDatos));
        while((linea = lector.readLine()) != null){
            partes = linea.split(",");
            mapear();
        }
        lector.close();
        linea= null;
        lector= null;     
    }
    
        //Alumno nuevoAlumno = new Alumno(partes[0], ruti,asistencia);
        //nuevoColegio.agregarAlumno(nuevoAlumno);
    
    private void mapear(){
        String rut = partes[1];
        Integer ruti = Integer.valueOf(rut);
        LocalDate fecha = LocalDate.now();
        Asistencia[] asistencia = new Asistencia[193];
        int j = 0;
        String nombre = partes[0];
        for (int i = 4; i< partes.length; i=i+3){
            String asisti = partes[i];
            int asist = Integer.parseInt(asisti);
            if (asist == 1){
                asistencia[j] = new Asistencia(true, false, false, false, fecha);
            }
            if (asist == 2){
                asistencia[j] = new Asistencia(false, true, false, false, fecha);
            }
            if (asist == 3){
                asistencia[j] = new Asistencia(false, false, true, false, fecha);
            }
            if (asist == 4){
                asistencia[j] = new Asistencia(false, false, false, true, fecha);
            }
            
            String mesi = partes[i+1];
            String diai = partes[i+2];
            int mes = Integer.parseInt(mesi);
            int dia = Integer.parseInt(diai);
            fecha = LocalDate.of(2023, mes, dia);
            asistencia[j].setFecha(fecha);
            j++;
        }
        
        if (!partes[2].equals("null")){
            AlumnoDeporte deportista = new AlumnoDeporte(partes[0], ruti,asistencia, partes[2]);
            nuevoColegio.agregarAlumno(deportista);
        }else if(partes[3].equals("true")){
            AlumnoEspecial especial = new AlumnoEspecial(partes[0], ruti, asistencia, partes[3]);
            nuevoColegio.agregarAlumno(especial);
        }else{
            Alumno alumno = new Alumno(partes[0], ruti, asistencia);
            nuevoColegio.agregarAlumno(alumno);
        }
        
        
    }
       
}
