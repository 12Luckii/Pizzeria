/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author lucas
 */
public class Tradicional extends Pizza{
    
    private TipoMasa tipoMasa;
    
    public Tradicional(String nombre, int porcentaje, double costoBase, TipoMasa tipoMasa){
        super(nombre, porcentaje, costoBase);
        this.tipoMasa = tipoMasa;
    }
    
    @Override
    public double calcularCosto(){
        return (getCostoBase() * tipoMasa.getMultiplicador());
    }
    
    @Override
    public void mostrable(){
        System.out.println("Tipo de pizza "+ tipoMasa.name());
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Con un total de: "+ precioVenta());
    
    }
    
}
