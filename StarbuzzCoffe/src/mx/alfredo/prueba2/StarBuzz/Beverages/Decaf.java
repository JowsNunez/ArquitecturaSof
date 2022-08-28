package mx.alfredo.prueba2.StarBuzz.Beverages;

import mx.alfredo.prueba2.StarBuzz.Condiment;

public class Decaf extends Beverage{
    public Decaf(Condiment m){
        super(m);
    }

    @Override
    public String getDescription() {
        return "Decaf: "+super.getDescription();
    }

    @Override
    public double Cost() {
        return 60.75 + super.Cost();
    }
}
