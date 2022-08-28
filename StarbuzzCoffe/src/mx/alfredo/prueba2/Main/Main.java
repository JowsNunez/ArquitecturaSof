package mx.alfredo.prueba2.Main;

import mx.alfredo.prueba2.StarBuzz.*;
import mx.alfredo.prueba2.StarBuzz.Beverages.*;

public class Main {

    public static void main(String[] args){

        Beverage bebida = new HouseBlend(new Milk(new Milk(new Chocolate(new Soy(new WhippedCream())))));
        System.out.println(bebida.getDescription());
        System.out.println(bebida.Cost());

        Beverage bebida2 = new Expresso(new Milk(new Milk(new Chocolate(new Soy(new WhippedCream())))));
        System.out.println(bebida2.getDescription());
        System.out.println(bebida2.Cost());

        Beverage bebida3 = new Decaf(new Chocolate(new Soy(new WhippedCream())));
        System.out.println(bebida3.getDescription());
        System.out.println(bebida3.Cost());

        Beverage bebida4 = new DarkRoast(new WhippedCream());
        System.out.println(bebida4.getDescription());
        System.out.println(bebida4.Cost());

    }
}
