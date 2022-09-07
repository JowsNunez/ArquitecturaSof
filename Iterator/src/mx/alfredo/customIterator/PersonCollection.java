package mx.alfredo.customIterator;

import java.util.ArrayList;
import java.util.List;

public class PersonCollection implements Collection {

    private List<Person> personList;

    public PersonCollection(){
        this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }


    @Override
    public void addPerson(Person c) {

        this.personList.add(c);
    }

    @Override
    public void removePerson(Person c) {
        this.personList.remove(c);

    }

    @Override
    public Iterator iterator(List<Person> personList, String name) {
        return new PersonIterator(personList, name);
    }
}
