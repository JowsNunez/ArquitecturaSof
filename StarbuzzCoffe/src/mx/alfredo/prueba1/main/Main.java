package mx.alfredo.prueba1.main;

import mx.alfredo.prueba1.starbuzz.Beverage;
import mx.alfredo.prueba1.starbuzz.Chocolate;
import mx.alfredo.prueba1.starbuzz.HouseBlend;
import mx.alfredo.prueba1.starbuzz.Milk;

public class Main {
    public  static void main(String[] args){

        Beverage beverage = new HouseBlend(new Milk(new Milk(new Milk(new Chocolate()))));
        System.out.println(beverage.getDescription());
        beverage.Cost();

    }
}
