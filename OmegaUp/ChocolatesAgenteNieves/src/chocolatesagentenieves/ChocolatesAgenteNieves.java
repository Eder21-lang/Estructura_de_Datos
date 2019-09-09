package chocolatesagentenieves;

import java.util.Scanner;

import java.util.StringTokenizer;

public class ChocolatesAgenteNieves {

    public static Scanner teclado= new Scanner(System.in);
    
    public static void main(String[] args) {
        ListaDoble Lista=new ListaDoble();
        
        int longitud;
        int x=0, opcion;
        String numero, aux;
        System.out.println("Ingrese el numero de chocolates ");
        longitud=teclado.nextInt();
        System.out.println("Ingrese los costos : ");
        numero=teclado.nextLine();
        numero=teclado.nextLine();
        
        //Divide una cadena por caracteres
       StringTokenizer despedasar= new StringTokenizer(numero);
        while(despedasar.hasMoreTokens() && x<=longitud){//hasMoreToken checa wue no tenga ningun punto null y que siga teniendo elementos la cadena 
            if (x<longitud)
            {
               aux=despedasar.nextToken();//nextToken recupera el elemento extraido de la cadena
               Lista.insertarFinal(Integer.parseInt(aux));
            }
            else{
                System.out.println("Ingreso digitos de mas: ");
            }
            x++;
            
        }
        Lista.ganancia();
        
    }
    
}