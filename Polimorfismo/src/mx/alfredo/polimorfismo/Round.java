package mx.alfredo.polimorfismo;

public class Round implements Brush {

    private double size;

    public Round(){

    }

    @Override
    public void setSize(double size) {
        this.size = size;
    }


    public String toString(){
        return "Type: Round size:" + size;
    }





}
