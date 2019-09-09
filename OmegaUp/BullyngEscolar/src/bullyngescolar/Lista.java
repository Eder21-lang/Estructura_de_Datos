/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bullyngescolar;

/**
 *
 * @author ederj
 */
public class Lista {
    Nodo inicio;
		
		void insertar(Integer dato, String nombre) {
			Nodo newNodo = new Nodo(dato, nombre);
			
			if(inicio == null) {
				inicio = newNodo;
			} else {
				Nodo aux = inicio;
				Nodo ant = null;
				
				while(aux != null) {
					ant = aux;
					aux = aux.siguiente;
				}
				
				ant.siguiente = newNodo;
			}
		}
		
		 Nodo getMayor() {
			if(inicio == null) {
				return null;
			} 
			
			Nodo nodoAux = inicio;
			Nodo nodoMayor = inicio;
			
			while(nodoAux != null) {
				if(nodoMayor.dato < nodoAux.dato) 
					nodoMayor = nodoAux;
				
				nodoAux = nodoAux.siguiente;
			}
			
			return nodoMayor;
		}
		
		Nodo getMenor() {
			if(inicio == null) 
				return null;
			
			Nodo nodoAux = inicio;
			Nodo nodoMenor = inicio;
			
			while(nodoAux != null) {
				if(nodoMenor.dato > nodoAux.dato) {
					nodoMenor = nodoAux;
				}
				
				nodoAux = nodoAux.siguiente;
			}
			
			return nodoMenor;
		}
	}
}
