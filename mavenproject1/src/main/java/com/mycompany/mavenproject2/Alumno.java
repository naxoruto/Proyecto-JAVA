
package com.mycompany.mavenproject1;
import java.util.*;

public class Alumno {
    private String nombre; 
    private int rut;
    
    private ArrayList<boolean> asistencia = new ArrayList();
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
    
    
    
}
