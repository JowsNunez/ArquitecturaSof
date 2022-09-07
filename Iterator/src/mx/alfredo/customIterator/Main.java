package mx.alfredo.customIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PersonCollection personCollection = new PersonCollection();
        personCollection.addPerson(new Person("Jerry","imple@pasl.com",20));
        personCollection.addPerson(new Person("Sugey","Sugey@pasl.com",18));
        personCollection.addPerson(new Person("Edna","Edna@pasl.com",21));
        personCollection.addPerson(new Person("Sugey","Sugey@pasl.com",24));
        personCollection.addPerson(new Person("Rem","imple@pasl.com",20));
        personCollection.addPerson(new Person("Sugey","Sugey@pasl.com",19));
        personCollection.addPerson(new Person("Jose","imple@pasl.com",21));
        personCollection.addPerson(new Person("Sugey","Sugey@pasl.com",32));


        Iterator iterator = personCollection.iterator(personCollection.getPersonList(),null);

        while (iterator.hasNext()){
            Person currentPerson = iterator.next();
            System.out.println(currentPerson.toString());
        }

        System.out.println("* * * * * * * * * * * * * * * * * * * * *");

        Iterator iterator2 = personCollection.iterator(personCollection.getPersonList(),"Sugey");

        while (iterator2.hasNext()){
            Person currentPerson = iterator2.next();
            System.out.println(currentPerson.toString());
        }




        // write your code here
    }



}
