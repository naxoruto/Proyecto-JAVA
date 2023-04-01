package com.mycompany.mavenproject2;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.HashMap;

public class Mavenproject2 {

    public static void main(String[] args)throws Exception {
        int opcion = -1;
        //String st;
        LocalDate myObj = LocalDate.now();
        HashMap<Integer, Alumno> Hashmapita = new HashMap<>();
        Asistencia asist = new Asistencia(0,0,0,0,myObj);
        
        Scanner lector = new Scanner(System.in);
        
        BaseDatos auxiliar = new BaseDatos();
        auxiliar.EnvasarDatos(Hashmapita);
        
        while (opcion != 3){
            System.out.print("Que desea hacer? 1) agregar asistencia 2) mostrar asistencia: 3) cancelar: ");
            opcion = lector.nextInt();
            if (opcion == 1){
                System.out.print("Ingrese rut: ");
                opcion = lector.nextInt();
                asist = new Asistencia(0,0,0,0,myObj);
                asist.agregarAsistencia(opcion, myObj, asist, Hashmapita);
            }
            else if (opcion == 2){
                asist.mostrarAsistencia(Hashmapita);
            }
        }
    }
}
