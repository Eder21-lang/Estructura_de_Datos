/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosestructuras;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author ederj
 */
public class DosEstructuras {

    public static void main(String[] args) {
		Integer totalAcciones = null;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			totalAcciones = Integer.parseInt(in.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Cola cola = new Cola();
		Pila pila = new Pila();
		
		for(int c = 0; c < totalAcciones; c++) {
			String accion = null;
			
			try {
				accion = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(accion.equals("meter datos")) {
				try {
					Integer dato = Integer.parseInt(in.readLine());
					cola.offer(dato);
					pila.push(dato);
				} catch(Exception e) {
					e.printStackTrace();
				}
			} else if(accion.equals("sacar datos")) {
				Nodo nodoPila = pila.pop();
				Nodo nodoCola = cola.remove();
				
				System.out.println(nodoPila.dato + " " + nodoCola.dato);
			}
		}
	}
}
