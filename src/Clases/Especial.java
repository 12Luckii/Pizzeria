/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author lucas
 */
public class Especial extends Pizza{
    
    private int cantFaina;
    private TamanioEspecial tamanio;
    private static final double PRECIOINDIVIDUALFAINA = 3.5;

    public Especial(String nombre, int porcentaje, double costoBase, int cantFaina, TamanioEspecial tamanio) {
        super(nombre, porcentaje, costoBase);
        this.cantFaina = cantFaina;
        this.tamanio = tamanio;
    }
    
    @Override
    public double calcularCosto(){
        return (getCostoBase() * tamanio.getMultiplicador()) + (PRECIOINDIVIDUALFAINA * cantFaina);
    }
    
    @Override
    public void mostrable(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tamanio de la pizza: "+ tamanio.name());
        System.out.println("Cantidad de Faina pedidas: "+ cantFaina+ " Con un precio individual de: "+ PRECIOINDIVIDUALFAINA);
        System.out.println("Con un total de: "+ precioVenta());
    }
    
}
