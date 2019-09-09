/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bullyngescolar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.Principal;
/**
 *
 * @author ederj
 */
public class BullyngEscolar {

    public static void main(String ... args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Integer action = null;
		
		try {
			action = Integer.parseInt(in.readLine());
		} catch (Exception e) { 
			e.printStackTrace();
		}
		
		while(action != null && action > 0) {
			Lista lista = new Lista();
			
			for(int c = 0; c < action; c++) {
				String[] valores = null;
				
				try {
					valores = in.readLine().split("\\s+");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				Integer dato = null;
				
				try {
					dato = Integer.parseInt(valores[0]) * Integer.parseInt(valores[1]) * Integer.parseInt(valores[2]);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				lista.insertar(dato, valores[3]);
			}
			
			Nodo bully = lista.getMayor();
			Nodo victima = lista.getMenor();
			
			System.out.println(bully.nombre + " took clay from " + victima.nombre + ".");
			
			try {
				action = Integer.parseInt(in.readLine());
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
    
    }
}
