package mx.alfredo.prueba1.starbuzz;

public class HouseBlend extends Beverage{
    Condiment m;
    private double cost = 45.0;
    public HouseBlend (){
        super();
    }

    public HouseBlend (Condiment m){
        super(m);
        this.m = m;

        System.out.println(m.getDescription());
    }

    public String getDescription(){
       if(this.m!=null) return " HouseBlend with: "+ this.m.getDescription();

       return "HouseBlend";
    }

    public double Cost(){
        System.out.println(cost+m.Cost());
        return 45.0;
    }


}
