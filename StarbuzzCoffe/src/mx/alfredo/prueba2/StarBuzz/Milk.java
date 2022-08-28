package mx.alfredo.prueba2.StarBuzz;

public class Milk extends CondimentDecorator{

    private double cost =5;
    Condiment m;

    public Milk() {
    }

    public Milk(Condiment m){
        super(m);
        this.m = m;
    }

    @Override
    public double Cost() {
        if (m!=null) return this.cost + this.m.Cost();
        return this.cost;
    }

    @Override
    public String getDescription() {
        return "+ Milk " + super.getDescription();
    }
}
