package mx.alfredo.customIterator;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class PersonIterator implements Iterator {

    private List<Person> people;
    private int position;
    private String name;

    public PersonIterator(List<Person> people, String name) {
        this.people = people;
        this.position = position;
        this.name = name;
    }



    @Override
    public boolean hasNext() {

        while(position< people.size()){
            Person p = people.get(position);
            if(p.getName().equalsIgnoreCase(this.name)|| this.name==null){
                return true;
            }else{

                this.position++;
            }
        }

        return false;
    }

    @Override
    public Person next() {
        Person p = people.get(position);
        position++;
        return p;
    }
}
