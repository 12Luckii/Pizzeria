package pizzeria;

import Clases.*;

public class Pizzeria {

    public static void main(String[] args) {

        GestorPizzas pedidos = new GestorPizzas();

        Pizza p1 = new Tradicional(
                "Muzzarella Tradicional",
                30,
                1000,
                TipoMasa.MASAMEDIANA
        );

        Pizza p2 = new Especial(
                "Especial de la Casa",
                25,
                1200,
                3,
                TamanioEspecial.FAMILIAR
        );

        Pizza p3 = new Rectangular(
                "Rectangular Suprema",
                20,
                900,
                4,
                3,
                QuesoAdicional.DOBLE
        );

        pedidos.agregarPizza(p1);
        pedidos.agregarPizza(p2);
        pedidos.agregarPizza(p3);
        
        System.out.println("Sistema de la pizzaria");
        System.out.println("*********");
        
        pedidos.mostrarPizzas();
        System.out.println();
        pedidos.mostrarPrecios();
        
    }
}

