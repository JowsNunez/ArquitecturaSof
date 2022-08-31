package mx.alfredo.prueba1.starbuzz;


public class Expresso extends Beverage {

    private Condiment m;
    private double cost = 40.0;

    public Expresso (Condiment m){
        super(m);
        this.m = m;

        System.out.println(m.getDescription());
    }

    public String getDescription(){
        return "Expresso: "+ this.m.getDescription();

    }

    public double Cost(){
        return this.cost + m.Cost();
    }

}
