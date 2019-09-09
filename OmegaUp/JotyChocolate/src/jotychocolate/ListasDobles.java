/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jotychocolate;

/**
 *
 * @author ederj
 */
public class ListasDobles {

    Nodo inicio;
    Nodo fin;
    void insertarFinal(Integer elemento, int posicion){
        Nodo nuevo= new Nodo();
        nuevo.dato=elemento;
        nuevo.posicion=posicion;
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
  
    void mostrarLista(){
        Nodo temp=new Nodo();
        temp=inicio;
        if(inicio!=null){
            while(temp!=null){
                System.out.println(temp.dato);
                temp=temp.siguiente;
            }
        }
    }
    void totalChocolates()
    {
        int exponente=1;
        Nodo temp1=inicio.siguiente;
        Nodo temp2=temp1.siguiente;
        Integer azul=fin.dato;
        Integer rojo =fin.anterior.dato;
        Integer chocolates=0;
        while (exponente<=inicio.dato)
        {
            if  ( exponente % temp1.dato ==0)
            {
                chocolates=chocolates+rojo;
              if (exponente % temp1.dato ==0 && exponente % temp2.dato ==0)
                {
                    if (rojo>azul)
                      {
                        exponente++;
                      }
                    else if (azul>rojo)
                      {
                        chocolates=chocolates +(azul-rojo);
                        exponente++;
                       }
                    else
                      {
                        exponente++;
                       }
                }
              else
              {
                  exponente++;
              }
            }
          
            else if  ( exponente % temp2.dato ==0)
            {
                if (exponente % temp1.dato ==0 && exponente % temp2.dato ==0)
                {
                    exponente++;
                }
                else
                {
                   chocolates=chocolates+azul;
                   exponente++;
                }
               
            }
            else
            {
                exponente++;
            }
  
            
        }
      
         java.math.BigDecimal totalChoco = new java.math.BigDecimal(Integer.toString(chocolates));
         System.out.println(totalChoco);
        
        
        
        
    }
    
    
}
