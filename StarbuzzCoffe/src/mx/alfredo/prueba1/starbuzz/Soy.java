package mx.alfredo.prueba1.starbuzz;





    public class Soy implements Condiment {
        private double cost =9.5;
        private Condiment m;
        private final String  description = "Soy: " + cost;



        public Soy() {
        }

        public Soy(Condiment m){

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
