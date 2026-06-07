/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author lucas
 */
public class Rectangular extends Pizza{
    
    private static final double PRECIOUNITARIO = 5.00;
    private int largo;
    private int ancho;
    private QuesoAdicional quesoAdicional;
    
    public Rectangular(String nombre, int porcentaje, double costoBase, int largo,
            int ancho, QuesoAdicional quesoAdicional){
        super(nombre, porcentaje, costoBase);
        this.largo = largo;
        this.ancho = ancho;
        this.quesoAdicional = quesoAdicional;
    }
    
    @Override
    public double calcularCosto(){
        return getCostoBase() + (largo*ancho*PRECIOUNITARIO) + quesoAdicional.getPrecio();
    }
    
    @Override
    public void mostrable(){
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Porciones: "+ (largo*ancho));
        System.out.println("Tipo de queso: "+ quesoAdicional.name());
        System.out.println("Con un total de: "+ precioVenta());
    }
    
}
