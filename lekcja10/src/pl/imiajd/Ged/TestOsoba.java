package pl.imiajd.Ged;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ArrayList<Osoba> lista = new ArrayList<>();
        lista.add(new Osoba("Jan", LocalDate.of(2000,11,12)));
        lista.add(new Osoba("Janek", LocalDate.of(2001,12,22)));
        lista.add(new Osoba("Janusz", LocalDate.of(2000,11,12)));
        lista.add(lista.get(0).clone());
        lista.add(new Osoba("Jan", LocalDate.of(2004,04,22)));

        System.out.println(lista.get(0));
        System.out.println(lista.get(0).equals(lista.get(3)));
        System.out.println(lista.get(0).equals(lista.get(4)));
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);


    }
}
