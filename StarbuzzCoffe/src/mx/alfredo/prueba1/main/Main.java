package mx.alfredo.prueba1.main;

import mx.alfredo.prueba1.starbuzz.*;

public class Main {
    public  static void main(String[] args){

        Beverage beverage = new HouseBlend(new Milk(new Milk(new Milk(new Chocolate()))));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.Cost());

       beverage = new Expresso(new Milk(new WhippedCream(new Soy(new Chocolate()))));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.Cost());

        beverage = new Decaf(new Milk(new Milk(new Soy(new Chocolate()))));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.Cost());

        beverage = new DarkRoast(new Milk(new Milk(new WhippedCream(new Chocolate()))));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.Cost());

    }
}
