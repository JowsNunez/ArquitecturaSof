package mx.alfredo.prueba1.starbuzz;



public class Beverage {

    private Condiment m;



    public Beverage(){


    }
    public Beverage(Condiment m){
        this.m =m;
    }

    public void addCondiment(Condiment m){
        this.m=m;
    }

    public String getDescription(){
        if(m!=null) return m.getDescription();

        return "";
    }

    public double Cost(){

        return 0.0;
    }


}
