package pl.imiajd.ged;

public class OsobaTest {
    public static void main(String[] args)
    {
        Osoba proba=new Osoba("denile",1999);
        Nauczyciel pani=new Nauczyciel("Gosia",1980,"2000zł");
        Student Joasia=new Student("denile",1999,"kryminologia");
        System.out.println(proba.toString());
        System.out.println(pani.toString());
        System.out.println(Joasia.toString());
    }
}
