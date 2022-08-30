package mx.alfredo.polimorfismo;

public class Main {

    public static void main(String[] args) {

        Brush brush = new Round();
        brush.setSize(5.0);
        Round s = new Round();
        System.out.println(brush);
        brush =  new Fat();
        brush.setSize(9.2);
        System.out.println(brush);




        // write your code here
    }
}
