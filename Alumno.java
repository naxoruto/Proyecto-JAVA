package com.mycompany.proyecto;
import java.util.Scanner;
public class Alumno {
    private String nombre;
    private String apellido;
    private int rut;
    
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void creaAlumno (){
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = lector.nextLine();
        System.out.print("Ingrese apellido: ");
        apellido = lector.nextLine();
        System.out.print("Ingrese rut sin punto y sin guión: ");
        rut = lector.nextInt();
    }
}