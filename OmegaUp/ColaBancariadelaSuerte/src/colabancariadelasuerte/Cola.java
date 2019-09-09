/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colabancariadelasuerte;

/**
 *
 * @author ederj
 */
public class Cola {
    Nodo inicio=null;
    Nodo fin=null;
    
    void C (String N,int P){
        Nodo nuevo=new Nodo();
        nuevo.N=N;
        nuevo.P=P;
        nuevo.anterior=null;
        nuevo.siguiente=null;
        if (inicio==null){
        inicio=nuevo;
        fin=nuevo;
        }else{
        Nodo aux=fin;
        aux.siguiente=nuevo;
        nuevo.anterior=aux;
        fin=nuevo;}
        
    }
    
    void S(char L,int I){
    Nodo aux=inicio;
    if(aux==null)return;
    else{
    while(aux!=null){
    char L1=aux.N.charAt(0);
    if(L==L1)aux.P=aux.P+I;       
    aux=aux.siguiente;
    }
    }   
    } 
    
    boolean isEmpty(){
    if (inicio==null) return true;
    return false;
    }
    
    String A (){
    String salida;
    Nodo aux=inicio;
    Nodo aux2=aux.siguiente;
    if ((aux.anterior==null)&&(aux.siguiente==null)){
        salida=aux.N;
    inicio=null;
    
    }
    else{
    while(aux2!=null){
    if(aux.P<aux2.P){
    aux=aux2;
    aux2=aux2.siguiente;    
    }else{
    aux2=aux2.siguiente;
    }}
    salida=aux.N;
    
    if(aux.anterior==null){
            
            aux2=aux.siguiente;
            aux2.anterior=null;
            inicio=aux2;
            aux.siguiente=null;
    }else{ 
    aux2=aux.anterior;
        
    if(aux.siguiente!=null){
      aux=aux.siguiente;
    aux2.siguiente=aux;
    aux.anterior=aux2;}
    else{
    aux2.siguiente=null;
    aux.anterior=null;
    }
    }
    } 
    return salida;
    }
     
     
    void recorrer(){
    Nodo aux=inicio;
    while(aux!=null){
    System.out.println(aux.N+" "+aux.P);
    aux=aux.siguiente;
    }
    }
}
