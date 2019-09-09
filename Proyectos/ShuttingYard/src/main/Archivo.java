/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author ederj
 */
public class Archivo {
    String[] leerArchivo(){
        String[] resultado= null;
        try{
        FileReader reader=new FileReader("polaca.txt");
        BufferedReader buffer=new BufferedReader(reader);
        String numeroS=buffer.readLine();
        
        int lineas=Integer.valueOf(numeroS);
         resultado= new String[lineas];
        
            for (int i = 0; i <lineas; i++) {
                String cadena=buffer.readLine();
                resultado[i]=cadena;
            System.out.println(cadena);
            }
        
        //buffer.readLine();
        buffer.close();
        reader.close();
        }catch(Exception e){
    }
        return resultado;
}

}
