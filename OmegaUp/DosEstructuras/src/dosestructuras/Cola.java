/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosestructuras;

/**
 *
 * @author ederj
 */
public class Cola {
    Nodo inicio;
		
		 void offer(Integer dato) {
			Nodo newNodo = new Nodo(dato);
			
			if(inicio == null) {
				inicio = newNodo;
			} else {
				Nodo nodoAux = inicio;
				Nodo anterior = null;
				
				while(nodoAux != null) {
					anterior = nodoAux;
					nodoAux = nodoAux.anterior;
				}
				
				anterior.anterior = newNodo;
				newNodo.siguiente = anterior;
			}
		}
		
		Nodo remove() {
			if(inicio == null) 
				return null;
			
			Nodo nodoAux = inicio;
			Nodo nodoSig = inicio.anterior;
			
			inicio = nodoSig;
			
			if(nodoSig != null) {
				nodoSig.siguiente = null;
			}
			
			nodoAux.anterior = null;
			nodoAux.siguiente = null;
			
			return nodoAux;
		}
	}
}
