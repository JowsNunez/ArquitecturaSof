package mx.alfredo.customIterator;

public class Person {
    private String name;
    private String email;
    private int yearsOld;

    public Person(String name, String email, int yearsOld) {
        this.name = name;
        this.email = email;
        this.yearsOld = yearsOld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name: '" + name + '\'' +
                ", email: '" + email + '\'' +
                ", yearsOld: " + yearsOld +
                ']';
    }
}
