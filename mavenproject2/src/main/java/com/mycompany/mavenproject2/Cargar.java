/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import Ventanas.Aviso;
import Ventanas.Inicio;
import Ventanas.Login;

public class Cargar {
    
    
    public String nombreProfe;
    public Login cargar = new Login();

    private String nombre(){
        cargar.setVisible(true);
        while (cargar.isActive()){
            String carga = cargar.getNombreProfe();
        }
        String carga = cargar.getNombreProfe();
        return carga;

    }
    
    public void recibirDatos(){
        LeerCsv abrir = new LeerCsv();
        if (nombre().equals("Ignacio Cuevas")){
            String prueba = "C:\\Users\\cross\\OneDrive\\Desktop\\Libro1.csv";
            abrir.leerArchivo(prueba);
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
            inicio.setLocation(null);
        }
        else{
            Aviso new aviso = new Aviso(Login, true);
            
            
        }
        
        
    }
}
