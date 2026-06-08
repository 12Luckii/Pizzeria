/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class GestorPizzas {
    
    private List<Pizza> pizzas;
    
    public GestorPizzas(){
        this.pizzas = new ArrayList<>();
    }
    
    public List<Pizza> getPizzas() {
        return new ArrayList<>(pizzas);
    }
    
    public void agregarPizza(Pizza p){
        pizzas.add(p);
    }
    
    public void mostrarPizzas(){
        if(pizzas.isEmpty()){
            System.out.println("No hay pizzas cargadas");
        }
        
        for (Pizza p : pizzas) {
            p.mostrable();
            System.out.println("--------------------");
        }   
    
    }
    
    public void mostrarPrecios(){
        System.out.println("=== PRECIOS ===");
        for (Pizza p : pizzas) {
            System.out.println(p.getNombre() + " -> " + p.precioVenta());
        }
    } 
}
