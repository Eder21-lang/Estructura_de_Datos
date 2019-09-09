/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasdeanagramas;

import java.util.Scanner;

import java.util.StringTokenizer;

public class ListasdeAnagramas {

    public static Scanner teclado= new Scanner(System.in);
    public static void main(String[] args) {
        int longitud;
        ListasDobles Lista= new ListasDobles();
        int x=1, opcion;
        String palabras, aux;
        longitud=teclado.nextInt();
        palabras=teclado.nextLine();
        palabras=teclado.nextLine();
        
        //Divide una cadena por caracteres
       StringTokenizer despedasar= new StringTokenizer(palabras);
        while(despedasar.hasMoreTokens()){//hasMoreToken checa wue no tenga ningun punto null y que siga teniendo elementos la cadena 
            
               aux=despedasar.nextToken();//nextToken recupera el elemento extraido de la cadena
               aux=aux.toLowerCase();
               Lista.insertarFinal(aux);
               longitud--;
        }
       Lista.Anagrama();
       System.out.println();
       
       
        
    }
}
