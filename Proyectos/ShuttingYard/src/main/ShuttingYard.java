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
public class ShuttingYard {
    Queue salida=new Queue();//cola
    Stack pila=new Stack();//pila
    
    Queue stringtoChars(String string){ //convertir la cadena a caracteres
        Queue cola= new Queue(); //nueva cola
        for (int i = 0; i < string.length(); i++) {
          //  System.out.println(string.charAt(i));//separa la cadena;
            cola.queue(string.charAt(i));//inserta en la cola cada caracter
        }
        return cola;//retorna la cola
    }
    
    boolean isLetra(char caracter){ //saber si es una letra

        if(caracter=='+'||caracter=='-'||caracter=='/'||caracter=='^'||caracter=='*'||caracter=='('||caracter==')'){
            return false;
        }else{
            return true;
            }
        
    }
    int peso(char signo){//definir la prioridad de cada signo
        switch(signo){
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            case '^':
                return 3;
            case '(':
                return 4;
         
            case ')':
                return 0;//caso especial
            default:
                return -1;
        }
    }
    boolean isAfuerMayorDentro(char dentro, char afuera){//saber si el que va a entrar tiene mas prioridad
                                                            //que el que esta adentro
        return peso(afuera)>peso(dentro);
    }
    
    void evalua(String expresion){//proceso de pilas y colas
        Queue entrada=stringtoChars(expresion); //entrada cola
        Queue salida= new Queue();//salida cola
        Stack pila=new Stack(); //pila
        char caracter;
        int cont=0;
        
       while((caracter=entrada.dequeue())!=0){//mientras que
           System.out.println("dequeue "+caracter);
           System.out.println("contador "+cont);
            if(isLetra(caracter)){//si es una letra
                salida.queue(caracter);//inserta a la cola de salida
            }else{//si es un signo ++++++++
               System.out.println("entra");
                if(pila.isPilaVacia()){//si la pila está vacía
                    pila.push(caracter);//inserta el caracter
                }else{//falta checar los () si no es vacia
                    if(peso(caracter)==0){
                        char c;
                        while((c=pila.pop())!='('){//mientras que sacar de la pila es diferente de cero
                            salida.queue(c); // a la salida insertar los caracteres
                        }   
                        
                    }else{
                        char signo=pila.pop();
                    if(signo=='('){
                        pila.push(signo);
                        pila.push(caracter);
                        pila.imprimir();
                    }else{
                        //signo es igual al primer caracter de la pila
                        //signo=adentro
                        //caracter=afuera
                        if(isAfuerMayorDentro(signo, caracter)){//si el que esta afuera es mayor que el de adentro

                           // pila.push(caracter);//insertamos el que estaba adentro
                            pila.push(signo);//insertamos el afuera
                            pila.push(caracter);//insertamos el que estaba adentro
                            pila.imprimir(); 
                        }else{//si el de adentro es mayor que el de afuera
                            salida.queue(signo);//a la salida insertamos el signo afyera
                            pila.push(caracter);//a la pila insertamos el que estaba 
                            pila.imprimir();
                        }
                    }
                    }
                }
            }
            cont++;
        }
        while((caracter=pila.pop())!=0){//mientras que sacar de la pila es diferente de cero
            salida.queue(caracter); // a la salida insertar los caracteres
        }
        while((caracter= salida.dequeue())!=0){//mientras que sacar de la salida es diferente de cero
            System.out.print(caracter);//imprimir los caracteres
        }
        
    }
}
