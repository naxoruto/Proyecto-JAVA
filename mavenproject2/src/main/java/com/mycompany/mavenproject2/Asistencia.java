
package com.mycompany.mavenproject2;

import java.util.HashMap;
import java.time.LocalDate;
import java.util.Scanner;

public class Asistencia {
    private int presente;
    private int ausente;
    private int retiro_anticipado;
    private int ausencia_justificada;
    private LocalDate fecha;
    
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Asistencia(int presente, int ausente, int retiro_anticipado, int ausencia_justificada, LocalDate fecha) {
        this.presente = presente;
        this.ausente = ausente;
        this.retiro_anticipado = retiro_anticipado;
        this.ausencia_justificada = ausencia_justificada;
        this.fecha = fecha;
    }

    public int getPresente() {
        return presente;
    }

    public void setPresente(int presente) {
        this.presente = presente;
    }

    public int getAusente() {
        return ausente;
    }

    public void setAusente(int ausente) {
        this.ausente = ausente;
    }

    public int getRetiro_anticipado() {
        return retiro_anticipado;
    }

    public void setRetiro_anticipado(int retiro_anticipado) {
        this.retiro_anticipado = retiro_anticipado;
    }

    public int getAusencia_justificada() {
        return ausencia_justificada;
    }

    public void setAusencia_justificada(int ausencia_justificada) {
        this.ausencia_justificada = ausencia_justificada;
    }

    
    
    
    public void agregarAsistencia(int rut, LocalDate fecha, Asistencia asist, HashMap Hashmapita){
       // verificar si está en el HashMapita :3
       int opc;
       String st;
       Scanner lector = new Scanner(System.in);
       
       if (Hashmapita.containsKey(rut)) {
           System.out.print("1) Asistió 2) No asistió 3) Retiro anticipado 4) Ausencia justificada: ");
           opc = lector.nextInt();
           if (opc == 1){
               Alumno alumno = (Alumno) Hashmapita.get(rut);
               alumno.Arre[alumno.ult] = asist;
               alumno.Arre[alumno.ult].presente = 1;
               alumno.ult++;             
           }  
           if (opc == 2){
               Alumno alumno = (Alumno) Hashmapita.get(rut);
               alumno.Arre[alumno.ult] = asist;
               alumno.Arre[alumno.ult].ausente = 1;
               alumno.ult++;
               
           }
           if (opc==3){
               Alumno alumno = (Alumno) Hashmapita.get(rut);
               alumno.Arre[alumno.ult] = asist;
               alumno.Arre[alumno.ult].retiro_anticipado = 1;
               alumno.Arre[alumno.ult].presente = 1;
               alumno.ult++;
               
           }
           if (opc==4){
               Alumno alumno = (Alumno) Hashmapita.get(rut);
               alumno.Arre[alumno.ult] = asist;
               alumno.Arre[alumno.ult].ausencia_justificada = 1;
               alumno.ult++;
                
           }
           
           
       }else{
           System.out.print("Ingrese el nombre de la/el alumno: ");
           st = lector.nextLine();
           Asistencia arreglo[] = new Asistencia[193];
           

           System.out.print("1) Asistió 2) No asistió 3) Retiro anticipado 4) Ausencia justificada: ");
           opc = lector.nextInt();
           if (opc == 1){
               asist.presente = 1;
               Alumno alumno = new Alumno(st, rut, arreglo,0);
               arreglo[0] = asist;
               alumno.setUlt(1);
               alumno.setArre(arreglo);
               Hashmapita.put(rut, alumno);            
           }  
           if (opc == 2){
               asist.ausente = 1;
               Alumno alumno = new Alumno(st, rut, arreglo,0);
               arreglo[0] = asist;
               alumno.setUlt(1);
               alumno.setArre(arreglo);
               Hashmapita.put(rut, alumno); 
           }
           if (opc==3){
               asist.presente = 1;
               asist.retiro_anticipado = 1;
               Alumno alumno = new Alumno(st, rut, arreglo,0);
               arreglo[0] = asist;
               alumno.setUlt(1);
               alumno.setArre(arreglo);
               Hashmapita.put(rut, alumno); 
           }
           if (opc==4){
               asist.ausencia_justificada = 1;
               Alumno alumno = new Alumno(st, rut, arreglo,0);
               arreglo[0] = asist;
               alumno.setUlt(1);
               alumno.setArre(arreglo);
               Hashmapita.put(rut, alumno); 
           }
       }
    }
    
    public void mostrarAsistencia(HashMap Hashmapita){
        for(Object objeto : Hashmapita.values()) {
            Alumno alumno = (Alumno) objeto;
            System.out.println("Nombre: " + alumno.getNombre()+", RUT: "+ alumno.getRut());
            Asistencia[] asist = alumno.getArre();
            for (int i = 0; i < alumno.getUlt(); i++) {
                System.out.println("Fecha: " + asist[i].getFecha());
                if (asist[i].getAusencia_justificada() == 1)
                    System.out.println("Ausencia justificada.");
                if (asist[i].getAusente() == 1)
                    System.out.println("Ausente.");
                if (asist[i].getRetiro_anticipado() == 1)
                    System.out.println("Retiro anticipado y presente.");
                if (asist[i].getPresente() == 1 && asist[i].getRetiro_anticipado() != 1)
                    System.out.println("Presente.");
            }
        }   
    }
    
    public void pasarAsistencia (HashMap Hashmapita, LocalDate fecha){
        for(Object objeto : Hashmapita.values()) {
            Alumno alumno = (Alumno) objeto;
            System.out.println("Nombre: " + alumno.getNombre()+", RUT: "+ alumno.getRut());
            Asistencia asist = new Asistencia(0,0,0,0, fecha );
            asist.agregarAsistencia(alumno.getRut(), fecha, asist, Hashmapita);
          }  
    }
}

