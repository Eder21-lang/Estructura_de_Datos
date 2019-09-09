/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocolatesagentenieves;

/**
 *
 * @author ederj
 */
public class ListaDoble {
    Nodo inicio;
    Nodo fin;
    
    void insertarFinal(int elemento){
        Nodo nuevo= new Nodo();
        nuevo.dato=elemento;
        nuevo.siguiente=null;
        nuevo.anterior=null;
        if(inicio==null){
            inicio=nuevo;
            fin=nuevo;
        } else {
            fin.siguiente=nuevo;
            nuevo.anterior=fin;
            fin=nuevo;
        }
    }
    void mostrarListaInicio(){
        Nodo temp=new Nodo();
        temp=inicio;
        if(inicio!=null){
            while(temp!=null){
                System.out.print(temp.dato);
                System.out.print(" ");
                temp=temp.siguiente;
            }
        }
        
    }
 
     void ganancia()
     {
         Nodo temp= new Nodo();
         Nodo tempFinal= new Nodo();
         int total=0;
         temp=inicio;
         tempFinal=fin;
         int  y=1;
         while (temp!=null && tempFinal!=null)
         {
             if (inicio==fin)
             {
                 total=total +(inicio.dato*y);
                 break;
             }
             else if (temp.dato<tempFinal.dato)
            {
                total=total +(temp.dato*y);
                temp=temp.siguiente;
                inicio=temp;
                y++;
                
            }
            else 
            {
                total=total+(tempFinal.dato*y);
                tempFinal=tempFinal.anterior;
                fin=tempFinal;
                y++;
               
            }
             
         }
         System.out.println("Ganancia: "+total);
     }
    
}