package com.mycompany.mavenproject2;

public class AlumnoEspecial extends Alumno {

    private String condicion;

    public AlumnoEspecial(String nombre, int rut, Asistencia asistencias[], String condicion) {
        super(nombre, rut, asistencias);
        this.condicion = condicion;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
  
 /*
Calcula el porcentaje de inasistencia de un alumno.
Si el porcentaje es mayor o igual al 40%, se retorna true (reprobado del curso),
    de lo contrario false.
*/
    @Override
      public boolean alumnoRepro(Alumno alumno){     
        if(alumno.porcentajeInasistencia(alumno) >= 35)
            return true;
        return false;
    }

}