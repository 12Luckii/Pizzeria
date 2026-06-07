/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Clases;

/**
 *
 * @author lucas
 */
public enum TipoMasa {
    
    MASAALAPIEDRA(2.2), 
    MASAMEDIANA(5.0), 
    MOLDE(7.00);
    
    private double multiplicador; 
    
    private TipoMasa(double multiplicador){
        this.multiplicador = multiplicador;
    }
    
    public double getMultiplicador(){
        return multiplicador;
    }
    
}
