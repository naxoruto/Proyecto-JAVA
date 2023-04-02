
package com.mycompany.mavenproject2;

public class Profesor {
    private String nombre;
    private int rut;

    public Profesor(int rutp, String nombre) {
        this.nombre = nombre;
        this.rut = rut;
    }
    
    public void prof(String nom) {
        System.out.println("Nombre Profesor : " + nom);
    }

    public void prof(int rutp) {
        System.out.println("Su rut es : " + rutp);
    }

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
