/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;



import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
public class GuardarCsv {
    private HashMap<Integer, Alumno> alumnos = new HashMap<Integer, Alumno>();
    private List<List<String>> listadeListas = new ArrayList<>();
    private Colegio colegio;
   
    public GuardarCsv(Colegio colegio) {
        this.colegio = colegio;
    }

    /**
     *
     * @throws GuardarException
     */
    public void Guardar() throws GuardarException {
    try {
        alumnos = colegio.getalumnos();

        String mes;
        String dia;
        int j = 0;
        for (Integer key : alumnos.keySet()) {
            Alumno alumno = alumnos.get(key);
            List<String> lista = new ArrayList<>();
            lista.add(alumno.getNombre());
            lista.add(key.toString());
            if (alumno instanceof AlumnoDeporte) {
                AlumnoDeporte alumnodeporte = (AlumnoDeporte) alumno;
                lista.add(alumnodeporte.getDeporte());
                lista.add("false");
            } else if (alumno instanceof AlumnoEspecial) {
                AlumnoEspecial alumnoespecial = (AlumnoEspecial) alumno;
                lista.add("null");
                lista.add(alumnoespecial.getCondicion());
            } else {
                lista.add("null");
                lista.add("false");
            }
            for (int i = 0; i < alumnos.get(key).getAsistencias().length; i++) {
                if (alumno.getAsistencias()[i] == null)
                    break;
                if (alumno.getAsistencias()[i].isPresente() == true)
                    lista.add("1");
                if (alumno.getAsistencias()[i].isAusente() == true)
                    lista.add("2");
                if (alumno.getAsistencias()[i].isRetiro_anticipado() == true)
                    lista.add("3");
                if (alumno.getAsistencias()[i].isAusencia_justificada() == true)
                    lista.add("4");
                mes = String.valueOf(alumno.getAsistencias()[i].getFecha().getMonthValue());
                dia = String.valueOf(alumno.getAsistencias()[i].getFecha().getDayOfMonth());
                lista.add(mes);
                lista.add(dia);
            }
            j++;
            listadeListas.add(lista);
        }
        String filename = "Libro1.csv";
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
        for (List<String> line : listadeListas) {
            writer.println(String.join(",", line));
        }
        writer.close();
    } catch (IOException e) {
        throw new GuardarException("Error al guardar el archivo.", e);
    }
}

}

