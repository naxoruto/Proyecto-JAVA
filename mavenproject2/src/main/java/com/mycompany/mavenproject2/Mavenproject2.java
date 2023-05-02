
package com.mycompany.mavenproject2;

import Ventanas.Inicio;

public class Mavenproject2 {

    public static void main(String[] args) {  
        Colegio colegio = new Colegio();
        Inicio inicio = new Inicio(colegio);
        inicio.iniciar();
    }
}