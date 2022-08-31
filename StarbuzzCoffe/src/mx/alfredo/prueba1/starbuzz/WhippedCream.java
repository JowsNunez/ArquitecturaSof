package mx.alfredo.prueba1.starbuzz;



public class WhippedCream implements Condiment {
    private double cost =9.5;
    private Condiment m;
    private final String  description = "WhippedCream: " + cost;



    public WhippedCream() {
    }

    public WhippedCream(Condiment m){

        this.m = m;
    }

    public String getDescription(){
        if(m!=null) return description + " "+ m.getDescription();
        return description;
    }

    public double Cost(){

        if(m!=null) return cost + m.Cost();
        return cost;
    }
}
