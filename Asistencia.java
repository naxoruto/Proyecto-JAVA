package com.mycompany.proyecto;
import java.util.Scanner;

public class Asistencia {
    private Alumno arreglo = new Alumno();
    private int asistido;
    private int no_asistido;
    private int retiro_temprano;
    private int falta_just;
    
    public Alumno getArreglo() {
        return arreglo;
    }

    public void setArreglo(Alumno arreglo) {
        this.arreglo = arreglo;
    }

    public int getAsistido() {
        return asistido;
    }

    public void setAsistido(int asistido) {
        this.asistido = asistido;
    }

    public int getNo_asistido() {
        return no_asistido;
    }

    public void setNo_asistido(int no_asistido) {
        this.no_asistido = no_asistido;
    }

    public int getRetiro_temprano() {
        return retiro_temprano;
    }

    public void setRetiro_temprano(int retiro_temprano) {
        this.retiro_temprano = retiro_temprano;
    }

    public int getFalta_just() {
        return falta_just;
    }

    public void setFalta_just(int falta_just) {
        this.falta_just = falta_just;
    }
    public void creaAsistencia(){
        System.out.print("ingrese asistencias: ");
        System.out.print("ingrese no asistido: ");
        System.out.print("ingrese retiro temprano: ");
        System.out.print("ingrese faltas justificadas: ");
    }
}
