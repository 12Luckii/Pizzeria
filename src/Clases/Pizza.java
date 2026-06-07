/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Objects;

/**
 *
 * @author lucas
 */
public abstract class Pizza implements Mostrables {
    
    private String nombre;
    private int porcentaje;
    private double costoBase;

    public Pizza(String nombre, int porcentaje, double costoBase) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.costoBase = costoBase;
    }
    
    public abstract double calcularCosto();

    public double precioVenta(){
        double costo = calcularCosto();
        double ganancia = (costo * getPorcentaje()) / 100;
        return costo + ganancia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }
    
    public double getCostoBase() {
        return costoBase;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(this == obj) return true;
        if(!(obj instanceof Pizza)) return false;
        Pizza p = (Pizza) obj;
        return p.nombre.equals(this.nombre) &&
                p.porcentaje==this.porcentaje &&
                p.costoBase==this.costoBase;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(nombre, porcentaje, costoBase);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza{");
        sb.append("nombre=").append(nombre);
        sb.append(", porcentaje=").append(porcentaje);
        sb.append(", costoBase=").append(costoBase);
        sb.append('}');
        return sb.toString();
    }
    
}
