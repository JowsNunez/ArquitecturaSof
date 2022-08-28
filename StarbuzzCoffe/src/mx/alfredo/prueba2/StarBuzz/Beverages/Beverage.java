package mx.alfredo.prueba2.StarBuzz.Beverages;

import mx.alfredo.prueba2.StarBuzz.Condiment;

// clase padre Beverage
public class Beverage implements Condiment {
    private Condiment m ;
    public Beverage(Condiment m){
        this.m = m;
    }
    public Beverage(){}

    @Override
    public double Cost() {
        return m.Cost();
    }

    @Override
    public String getDescription() {
        return m.getDescription();
    }
}
