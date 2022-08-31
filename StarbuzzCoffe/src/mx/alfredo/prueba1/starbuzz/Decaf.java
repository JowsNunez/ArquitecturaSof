package mx.alfredo.prueba1.starbuzz;



public class Decaf extends Beverage {
    private Condiment m;
    private double cost = 85.0;

    public Decaf (Condiment m){
        super(m);
        this.m = m;

        System.out.println(m.getDescription());
    }

    public String getDescription(){
        return "Decaf: "+ this.m.getDescription();

    }

    public double Cost(){
        return this.cost + m.Cost();
    }
}
