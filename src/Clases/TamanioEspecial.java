/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Clases;

/**
 *
 * @author lucas
 */
public enum TamanioEspecial {
    
    PERSONAL(5.00),
    MEDIANO(6.00), 
    FAMILIAR(8.5);
    
    private double multiplicador;
    
    private TamanioEspecial(double multiplicador){
        this.multiplicador = multiplicador;
    }
    public double getMultiplicador(){
        return multiplicador;
    }
    
}
