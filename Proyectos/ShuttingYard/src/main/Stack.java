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
public class Stack {
    NodoStack inicio;
    
    void push(char dato){
        NodoStack nuevo=new NodoStack();
        nuevo.dato=dato;
        nuevo.siguiente=null;
        if(inicio!=null){
            nuevo.siguiente=inicio;
        }
        inicio=nuevo;
    }
    
    char pop(){
        if(inicio!=null){
             NodoStack aux=inicio;
             inicio=inicio.siguiente;
             aux.siguiente=null;
             return aux.dato;
        }
        return 0;
    }
    
    boolean isPilaVacia(){
      return inicio == null;
    }
    //return inicio=null;
    
    void imprimir(){
        NodoStack aux=inicio;
        System.out.println("PILA");
        while(aux!=null){
            System.out.println(aux.dato);
            aux=aux.siguiente;
        }
    }
}
