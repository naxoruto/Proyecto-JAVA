
package com.mycompany.mavenproject2;
//import java.time.LocalDate;



public class Alumno {
    private String nombre;
    private int rut;
    
    private Asistencia asistencias[] = new Asistencia[193];
    private int ult; // el ultimo valor agregado

    public Alumno(String nombre, int rut, int ult, Asistencia asistencias[]) {
        this.nombre = nombre;
        this.rut = rut;
        this.ult = ult;
        this.asistencias = asistencias;
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
    
    public double porcentajeInasistencia(Alumno alumno){
        Asistencia[] asist= alumno.getAsistencias();
        double porcentaje;
        int inasistencias = 0;
        int total = 0;
        for (int i = 0; i < asist.length; i++){
            if (asist[i].isPresente() == true)
                total++;
            if (asist[i].isPresente() == false){
                total++;
                inasistencias++;
            }
        }
        if (total == 0 || inasistencias == 0)
            return 0;
        porcentaje = (inasistencias * 100) / total;
        return porcentaje;
    }
    
    }
    
    
