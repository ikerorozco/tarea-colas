/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

import javax.swing.JOptionPane;

/**
 *
 * @author ikero
 */
public class classcola<T> {
    
    Nodo inicioCola,finalCola;
    String cola="";
    int tamanio=0;

    public classcola() {
        inicioCola=null;
        finalCola=null;
    }
    
    public boolean is_empty(){
    
        if(inicioCola==null){
        
        return true;
                
        }else{
        
            return false;
        
        }
    
    }
    
    public void enqueue(T elem){
    
        Nodo nuevoNodo=new Nodo();
        nuevoNodo.informacion=elem;
        nuevoNodo.siguiente=null;
        
        if(is_empty()){
        
            inicioCola=nuevoNodo;
            finalCola=nuevoNodo;
            
        }else{
        
            finalCola.siguiente=nuevoNodo;
            finalCola=nuevoNodo;
        
        }
        
        tamanio++;
    
    }
    
    public T dequeue(){
    
        if(!is_empty()){
        
            T informacion = (T) inicioCola.informacion;
            
            if(inicioCola==finalCola){
            
                inicioCola=null;
                finalCola=null;
            
            }else{
            
                inicioCola = inicioCola.siguiente;
            
            }
        
            tamanio--;
            return informacion;
        }else{
        
          return null;
        
        }
        
    
    }
    
    public int length(){   
    
        return tamanio;
    
    }
    
    public void to_string(){
    
        Nodo aux = inicioCola;
        
        String colaInvertida = "";
        
        while(aux != null){
            
          cola += aux.informacion+ " ";
          aux = aux.siguiente;
                  
        }
        
        String cadena[] =cola.split(" "); 
    
        for(int i = cadena.length-1 ; i>=0 ; i--){
        
            colaInvertida += " "+ cadena[i];
        
        }
    
        
        JOptionPane.showMessageDialog(null, colaInvertida);
        cola ="";
    }
    
    }
