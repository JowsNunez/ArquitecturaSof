package mx.alfredo.prueba2.StarBuzz;

public class WhippedCream extends CondimentDecorator{
    private double cost =9.5;
    Condiment m;

    public WhippedCream() {
    }

    public WhippedCream(Condiment m){
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
        return "+ WhippedCream " + super.getDescription();
    }
}
