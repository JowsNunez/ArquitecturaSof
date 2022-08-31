package mx.alfredo.prueba1.starbuzz;



public class Beverage implements Condiment{

    private Condiment m;

    public Beverage(Condiment m){
        this.m =m;
    }

    public String getDescription(){
        return m.getDescription();

    }

    public double Cost(){
            return m.Cost();
    }


}
