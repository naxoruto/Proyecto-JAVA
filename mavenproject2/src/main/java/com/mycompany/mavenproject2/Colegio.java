
package com.mycompany.mavenproject2;

import java.util.HashMap;


public class Colegio {
    private HashMap<Integer, Alumno> alumnos;

    public Colegio() {
        alumnos = new HashMap();
    }

    public HashMap<Integer, Alumno> getalumnos() {
        return alumnos;
    }

    public void setHashmapita(HashMap<Integer, Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public boolean agregarAlumno(Alumno nuevo){

        if (alumnos.containsKey(nuevo.getRut())){
            return false;
        }
        alumnos.put(nuevo.getRut(), nuevo);
        return true;
    }
    
    public Alumno mostrarAlumno(int rut){
        return (Alumno)alumnos.get(rut);
    }
    
    
    public boolean eliminarAlumno(int rut){
        if (alumnos.containsKey(rut)){
            alumnos.remove(rut);
            return true;
        }
        return false;
    }

}

    