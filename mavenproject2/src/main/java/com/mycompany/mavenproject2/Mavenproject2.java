
package com.mycompany.mavenproject2;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.HashMap;

public class Mavenproject2 {

    public static void main(String[] args)throws Exception {
        int opcion = -1;
        //String st;
        LocalDate myObj = LocalDate.now();
        HashMap<Integer, Alumno> Hashmapita = new HashMap<Integer, Alumno>();
        Asistencia asist = new Asistencia(0,0,0,0,myObj);
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingresa nombre profesor : ");
        String nomp = lector.nextLine();
        System.out.print("Ingresa rut profesor : ");
        int rutp = lector.nextInt();
        Profesor profe = new Profesor (rutp, nomp);
        profe.prof(nomp);
        profe.prof(rutp);
        
        BaseDatos auxiliar = new BaseDatos();
        auxiliar.EnvasarDatos(Hashmapita);
        
         while (opcion != 4){
            System.out.print("Que desea hacer? 1) agregar asistencia 2) mostrar asistencia 3) Pasar asistencia 4) cancelar: ");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese rut: ");
                    opcion = lector.nextInt();
                    asist = new Asistencia(0,0,0,0,myObj);
                    asist.agregarAsistencia(opcion, myObj, asist, Hashmapita);
                    break;
                case 2:
                    asist.mostrarAsitencia(Hashmapita);
                    break;
                case 3:
                    asist.mostrarAsistencia(Hashmapita, myObj);
                    break;
                default:
                    break;
            }
        }
    }
}
