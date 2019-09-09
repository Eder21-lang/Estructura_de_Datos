/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jotychocolate;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JotyChocolate {
public static Scanner teclado= new Scanner(System.in);
    public static void main(String[] args) {
        String integrales, aux;
        Double num;
        int x=0;
        ListasDobles lista = new ListasDobles ();
        integrales=teclado.nextLine();
        
        StringTokenizer despedasar= new StringTokenizer(integrales);
        while(despedasar.hasMoreTokens() ){ 
            aux=despedasar.nextToken();
            num=Double.parseDouble(aux);
            if ( num % 1 == 0)
            {
                if (Integer.parseInt(aux)>0 )
                {
                    lista.insertarFinal(Integer.parseInt(aux),x);
                }
                else 
                {
                    break;
                }
               
            }
            else 
            {
                break;
            }
            x++;
            
        }
        if (x==5)
        {
            lista.totalChocolates();
        }
        
    }
 
}
