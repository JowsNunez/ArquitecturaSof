package mx.alfredo.prueba1.starbuzz;


public class DarkRoast extends Beverage {
    private Condiment m;
    private double cost = 70.0;

    public DarkRoast (Condiment m){
        super(m);
        this.m = m;

        System.out.println(m.getDescription());
    }

    public String getDescription(){
        return "DarkRoast: "+ this.m.getDescription();

    }

    public double Cost(){
        return this.cost + m.Cost();
    }

}
