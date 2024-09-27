package immutableclasses;

public class ImMain {

    public static void main(String[] args) {

//        Person jane = new Person();
//        jane.setName("Jane");
//        Person jim = new Person();
//        jim.setName("Jim");
//        Person joe = new Person();
//        joe.setName("Joe");
//        Person john = new Person();
//        john.setName("John");
//        john.setDob("05/05/1900");
//        john.setKids(new Person[]{jim, jane, joe});
//        System.out.println(john);
        Person jane = new Person("Jane", "01/01/1930");
        Person joe = new Person("Joe", "02/02/1932)");
        Person jim = new Person("Jim", "03/03/1934");

        Person[] johnKids = {jane, joe, jim};
        Person john = new Person("John","05/05/1900",johnKids);

        System.out.println(john);

        john.setKids(new Person[]{new Person("Ann","04/04/1930")});
        System.out.println(john);
    }
}
