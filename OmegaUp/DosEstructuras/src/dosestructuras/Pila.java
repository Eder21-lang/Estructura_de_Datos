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
public class Pila {
    Nodo fin;
		
		void push(Integer dato) {
			Nodo newNodo = new Nodo(dato);
			
			if(fin == null) {
				fin = newNodo;
			} else {
				Nodo nodoAux = fin;
				
				newNodo.anterior = nodoAux;
				nodoAux.siguiente = newNodo;
				
				fin = newNodo;
			}
		}
		
		public Nodo pop() {
			if(fin == null) 
				return null;
			
			Nodo nodoAux = fin;
			fin = nodoAux.anterior;
			return nodoAux;
		}
}
