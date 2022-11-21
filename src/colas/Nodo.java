/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author ikero
 */
public class Nodo<T>{
    
    T informacion;
    Nodo siguiente;

    public Nodo() {
    }

    public Nodo(T informacion, Nodo siguiente) {
        this.informacion = informacion;
        this.siguiente = siguiente;
    }
    
    
    
}
