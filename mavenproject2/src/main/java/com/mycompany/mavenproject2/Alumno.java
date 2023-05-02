
package com.mycompany.mavenproject2;
//import java.time.LocalDate;





public class Alumno {
    private String nombre;
    private int rut;
    
    private Asistencia asistencias[] = new Asistencia[193];

    public Alumno(String nombre, int rut, Asistencia asistencias[]) {
        this.nombre = nombre;
        this.rut = rut;
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


    /*
    Este método calcula el porcentaje de asistencia del alumno. 
El método acepta un objeto de la clase "Alumno" como argumento
y devuelve un valor booleano que indica si el porcentaje de asistencia 
es menor al 30%.
*/
  public boolean alumnoRepro(Alumno alumno){      
        if(alumno.porcentajeInasistencia(alumno) > 30)
            return true;
        return false;
    }
  public double porcentajeInasistencia(Alumno alumno){
        Asistencia[] asist= alumno.getAsistencias();
        double porcentaje;
        double inasistencias = 0;
        double total = 0;
        for (int i = 0; i < asist.length; i++){
            if (asist[i] == null)
                break;
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
    
    
    
    

    
