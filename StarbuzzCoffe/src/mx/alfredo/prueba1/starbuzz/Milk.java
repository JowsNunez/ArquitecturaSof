package mx.alfredo.prueba1.starbuzz;

public class Milk implements Condiment {
    private Condiment m;
    private double cost = 5.00;
    private final String  description = "milk: " + cost;

    public Milk(){
    }
    public Milk(Condiment m){
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
