
package com.mycompany.mavenproject2;
//import java.time.LocalDate;


public class Alumno {
    private String nombre;
    private int rut;

    public Asistencia Arre[] = new Asistencia[193];
    public int ult; // el ultimo valor agregado

    public Alumno(String nombre, int rut,Asistencia Arre[], int ult) {
        this.nombre = nombre;
        this.rut = rut;
        this.ult = ult;
        this.Arre = Arre;
    }    
    
    public Asistencia[] getArre() {
        return Arre;
    }
    public int getUlt() {
        return ult;
    }

    public void setUlt(int ult) {
        this.ult = ult;
    }
    
    

    public void setArre(Asistencia[] Arre) {
        this.Arre = Arre;
    }
   

    public String getNombre() {
        return nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }


}
