/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

/**
 *
 * @author ikero
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        classcola COLA = new classcola();
        
        System.out.println("La cola esta vacia? "+COLA.is_empty());
        
        COLA.enqueue("iker");
        COLA.enqueue("fer");
        COLA.enqueue("isa");
        
        System.out.println("La cola esta vacia? "+COLA.is_empty());
        
        System.out.println("El tamaño de la cola es: "+COLA.length());
        
        COLA.to_string();
        
        COLA.dequeue();
        
        System.out.println("El tamaño de la cola es: "+COLA.length());
        
        COLA.to_string();
        
    }
    
}
