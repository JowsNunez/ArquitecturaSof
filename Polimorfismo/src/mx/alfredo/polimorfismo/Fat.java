package mx.alfredo.polimorfismo;

public class Fat implements Brush {

    private double size;

    public Fat() {
    }

    @Override
    public void setSize(double size) {

        if (size > 5.5) {
            size = size * .9;
        }

        this.size = size;
    }


    public String toString(){
        return "Type: Fat size:" + size;
    }

}
