package mx.alfredo.customIterator;

import java.util.List;

public interface Collection {
     void addPerson(Person c);

     void removePerson(Person c);

     Iterator iterator(List<Person> personList, String name);
}
