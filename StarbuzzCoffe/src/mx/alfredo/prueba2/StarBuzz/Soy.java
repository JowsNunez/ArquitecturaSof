package mx.alfredo.prueba2.StarBuzz;

public class Soy extends CondimentDecorator{
    private double cost =5.67;
    Condiment m;

    public Soy() {
    }

    public Soy(Condiment m){
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
        return "+ Soy " + super.getDescription();
    }
}
