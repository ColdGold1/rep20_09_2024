package immutableclasses;

public class MainRecord {

    public static void main(String[] args) {
        
        PersonRecord jane = new PersonRecord("Jane", "01/01/1930");
        PersonRecord joe = new PersonRecord("Joe", "02/02/1932)");
        PersonRecord jim = new PersonRecord("Jim", "03/03/1934");

        PersonRecord[] johnKids = {jane, joe, jim};
        PersonRecord john = new PersonRecord("John","05/05/1900",johnKids);

        System.out.println(john);

        PersonRecord johnCopy = new PersonRecord("John","05/05/1900");

        System.out.println(johnCopy);

        PersonRecord[] kids = johnCopy.kids();
        kids[0] = jim;
        kids[1] = new PersonRecord("Kim","06/06/1900",kids);
        System.out.println(johnCopy);

    }
}
