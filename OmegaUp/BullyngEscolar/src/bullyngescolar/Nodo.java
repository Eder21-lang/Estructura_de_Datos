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
public class Nodo {
    Integer dato;
		String nombre;
		Nodo siguiente;
		
		public Nodo(Integer dato, String nombre) {
			this.dato = dato;
			this.nombre = nombre;
		}
}
