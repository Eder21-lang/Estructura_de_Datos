/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ederj
 */
public class Queue {
    NodoQueue inicio=null;
    NodoQueue fin=null;
    
    void queue(char dato){
        NodoQueue nuevo= new NodoQueue();
        nuevo.dato=dato;
        nuevo.siguiente=null;
        nuevo.anterior=null;
        if(inicio!=null){
            inicio.anterior=nuevo;
            nuevo.siguiente=inicio;
         //   System.out.println("insertando despues de un elemento");
        }else{
          //  System.out.println("insertando primer elemento");
            inicio=nuevo;
            fin=nuevo;
        }
    }
    
    char dequeue(){
        char letra;
        if(fin!=null){
            NodoQueue aux=fin;
            
            if(inicio==fin){
                inicio=null;
              //  System.out.println("un elemento");
                fin=null;
            }else{
                fin=fin.anterior;
                fin.siguiente=null;
            }
            aux.siguiente=null;
            aux.anterior=null;
            letra=aux.dato;
        }else{
            letra=0;
        }
        return letra;
    }
}
