package pizzeria;

import java.util.ArrayList;
import Clases.*;
import java.util.List;

public class Pizzeria {

    public static void main(String[] args) {

        List<Pizza> pizzas = new ArrayList<>();

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

        pizzas.add(p1);
        pizzas.add(p2);
        pizzas.add(p3);
        for (Pizza p : pizzas) {
            p.mostrable();
            System.out.println("--------------------");
        }

        System.out.println("=== PRECIOS ===");
        for (Pizza p : pizzas) {
            System.out.println(p.getNombre() + " -> " + p.precioVenta());
        }
    }
}

