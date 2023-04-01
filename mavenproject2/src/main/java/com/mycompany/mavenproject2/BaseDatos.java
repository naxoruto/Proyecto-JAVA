
package com.mycompany.mavenproject2;

import java.util.HashMap;
import java.time.LocalDate;
import java.util.Random;



public class BaseDatos {
    
    public void EnvasarDatos(HashMap Hashmapita){
        Asistencia arreglo[] = new Asistencia[193];
        String[] Nombres = {"Lionel Messi", "Matías Fernández", "Cristiano Ronaldo"};
        
        for(int i=0; i<=2; i++){
            Random rand = new Random();
            int rut = 15000000 + rand.nextInt((20000000 - 15000000) + 1);          
            int dia = (int) (Math.random() * 20) + 1;
            
            Alumno alumno = new Alumno(Nombres[i], rut, arreglo,i);
            
            for(int j=0; j<= 3; j++){
                LocalDate myObj = LocalDate.of(2023, 03, dia);
                Asistencia asist = new Asistencia(1,0,0,0,myObj);
                dia++;
                arreglo[j] = asist;
                alumno.setArre(arreglo);
                alumno.setUlt(j);
                Hashmapita.put(rut, alumno);
            }
        }
    }  
}
