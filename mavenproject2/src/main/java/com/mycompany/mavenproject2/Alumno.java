
package com.mycompany.mavenproject2;
//import java.time.LocalDate;



public class Alumno {
    private String nombre;
    private int rut;
    
    private Asistencia asistencias[] = new Asistencia[193];
    private int ult; // el ultimo valor agregado

    public Alumno(String nombre, int rut, int ult) {
        this.nombre = nombre;
        this.rut = rut;
        this.ult = ult;
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

    public Asistencia[] getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(Asistencia[] asistencias) {
        this.asistencias = asistencias;
    }

    public int getUlt() {
        return ult;
    }

    public void setUlt(int ult) {
        this.ult = ult;
    }

    
    }
    
    
