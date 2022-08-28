package mx.alfredo.prueba2.StarBuzz;

import mx.alfredo.prueba2.StarBuzz.Beverages.Beverage;

public class CondimentDecorator extends Beverage {


    private Condiment m;

    public CondimentDecorator(){}

    public CondimentDecorator(Condiment m) {
        super(m);
        this.m=m;
    }

    @Override
    public double Cost() {
        return m.Cost();
    }

    @Override
    public String getDescription() {
        if(m!=null) return m.getDescription();
        return "";
    }
}
