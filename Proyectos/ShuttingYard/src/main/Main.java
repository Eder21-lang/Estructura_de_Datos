/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author ederj
 */
public class Main {
    
    public static void main(String[] args){

        
     Archivo archivo = new Archivo();
        archivo.leerArchivo();
        String[] expresiones= archivo.leerArchivo();
        for (int i = 0; i < expresiones.length; i++) {
            System.out.println(expresiones[i]);
            System.out.println("------");
            e.evalua(expresiones[i]);
        }
       
    }
}
