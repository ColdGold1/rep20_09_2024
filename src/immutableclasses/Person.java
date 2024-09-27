package immutableclasses;

import java.util.Arrays;

public class Person {

    private String name;
    private String dob;
    private Person[] kids;

    public Person(String name, String dob, Person[] kids) {
        this.dob = dob;
        this.kids = kids;
        this.name = name;
    }

    public Person(String name, String dob) {
        this(name, dob,null);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Person[] getKids() {
        return kids;
    }

    public void setKids(Person[] kids) {
        this.kids = kids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String kidString = "n/a";
        if (kids != null){
            String[] names = new String[kids.length];
            Arrays.setAll(names, i -> names[i] = kids[i] == null ? " " : kids[i].name);
            kidString = String.join(", ", names);
        }
        return name + ", dob = " + dob + ", kids = " + kidString;
    }
}
