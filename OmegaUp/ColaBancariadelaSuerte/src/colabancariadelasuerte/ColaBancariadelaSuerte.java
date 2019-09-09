/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colabancariadelasuerte;

import java.util.Scanner;
/**
 *
 * @author ederj
 */
public class ColaBancariadelaSuerte {
    
    public static void main(String[] svgs) {
     Cola E=new Cola();
    Scanner scan =new Scanner(System.in);
     Scanner scan2 =new Scanner(System.in);
     int Entradas=scan.nextInt();
    for (int i = 1; i <=Entradas; i++) {
            String opc=scan2.nextLine();
            char A=opc.charAt(0);
            if(A=='A'){
                
                if (E.isEmpty()==false){
               String salida=E.A();
                System.out.println(salida);
                }
            }else{
            String[] parts;
            parts = opc.split(" ");
            String part1 = parts[0]; 
            String part2 = parts[1];
            String part3 = parts[2];
            char op=part1.charAt(0);
            switch (op) {
                case 'C':
                    int P = Integer.parseInt(part3);
                    E.C(part2, P);
                    break;
                case 'S':
                    char L=part2.charAt(0);
                    int I = Integer.parseInt(part3);
                    E.S(L,I);
                    
                    break;
                default:
                    return;
            }
            
            }
           
        }
    
    }
    
}
