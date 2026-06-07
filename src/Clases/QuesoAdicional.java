/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Clases;

/**
 *
 * @author lucas
 */
public enum QuesoAdicional {
    
    SIMPLE(3.00),
    DOBLE(5.00),
    TRIPLE(8.00);
    
    private double Precio;

    private QuesoAdicional(double Precio) {
        this.Precio = Precio;
    }
    
    public double getPrecio(){
        return Precio;
    }
    
}
