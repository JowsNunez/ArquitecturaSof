package mx.alfredo.prueba2.StarBuzz.Beverages;

import mx.alfredo.prueba2.StarBuzz.Beverages.Beverage;
import mx.alfredo.prueba2.StarBuzz.Condiment;

public class Expresso extends Beverage {

    public Expresso(Condiment m){
        super(m);
    }

    @Override
    public String getDescription() {
        return "Expresso: "+super.getDescription();
    }

    @Override
    public double Cost() {
        return 65.75 + super.Cost();
    }
}
