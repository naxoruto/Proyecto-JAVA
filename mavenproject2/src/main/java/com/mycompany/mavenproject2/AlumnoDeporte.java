package com.mycompany.mavenproject2;

public class AlumnoDeporte extends Alumno {
    private String Deporte;

    public AlumnoDeporte(String nombre, int rut,  Asistencia[] asistencias, String Deporte) {
        super(nombre, rut, asistencias);
        this.Deporte = Deporte;
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String Deporte) {
        this.Deporte = Deporte;
    }
    
/*
Calcula el porcentaje de inasistencia de un alumno.
Si el porcentaje es mayor o igual al 40%, se retorna true (reprobado del curso),
    de lo contrario false.
*/
    @Override
   public boolean alumnoRepro(Alumno alumno){    
        if(alumno.porcentajeInasistencia(alumno) >= 40)
            return true;
        return false;
    }
}

