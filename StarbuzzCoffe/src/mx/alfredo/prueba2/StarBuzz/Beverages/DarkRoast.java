package mx.alfredo.prueba2.StarBuzz.Beverages;

import mx.alfredo.prueba2.StarBuzz.Condiment;

public class DarkRoast extends Beverage{
    public DarkRoast(Condiment m){
        super(m);
    }

    @Override
    public String getDescription() {
        return "DarkRoast: "+super.getDescription();
    }

    @Override
    public double Cost() {
        return 80.37 + super.Cost();
    }

}
