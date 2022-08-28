package mx.alfredo.prueba2.StarBuzz.Beverages;

import mx.alfredo.prueba2.StarBuzz.Beverages.Beverage;
import mx.alfredo.prueba2.StarBuzz.Condiment;

public class HouseBlend extends Beverage {



    public HouseBlend(Condiment m){
        super(m);
    }

    @Override
    public String getDescription() {
        return "HouseBlend: "+super.getDescription();
    }

    @Override
    public double Cost() {
        return 45.0 + super.Cost();
    }
}
