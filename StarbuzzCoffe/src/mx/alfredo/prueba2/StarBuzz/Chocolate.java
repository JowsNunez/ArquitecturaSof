package mx.alfredo.prueba2.StarBuzz;

public class Chocolate extends CondimentDecorator{
    private double cost =6.75;
    Condiment m;

    public Chocolate() {
    }

    public Chocolate(Condiment m){
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
        return "+ Chocolate " + super.getDescription();
    }
}
