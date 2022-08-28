package mx.alfredo.prueba1.starbuzz;

public class Chocolate implements Condiment{
    private Condiment m;
    private double cost = 15.50;
    private final String  description = "Chocolate: " + cost;

    public Chocolate(){
    }
    public Chocolate(Condiment m){
        this.m = m;
    }

    public String getDescription(){
        if(m!=null) return description + " "+ m.getDescription();


        return description ;
    }

    public double Cost(){

        if(m!=null) return cost + m.Cost();
        return cost;
    }

}
