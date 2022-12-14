package mx.alfredo.prueba1.starbuzz;

public class HouseBlend extends Beverage{
    private Condiment m;
    private double cost = 45.0;

    public HouseBlend (Condiment m){
        super(m);
        this.m = m;

        System.out.println(m.getDescription());
    }

    public String getDescription(){
      return "HouseBlend: "+ this.m.getDescription();

    }

    public double Cost(){
        return this.cost + m.Cost();
    }


}
