package pl.imiajd.ged;
import java.util.*;
import java.time.LocalDate;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik(" Kowalski", new String[]{"jan"},LocalDate.of(2000,03,04),true,500,LocalDate.of(2012,04,22));
        ludzie[1] = new Student(" Nowak", new String[]{"malgosia"},LocalDate.of(2000,01,01),false,"infa",4.2);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis()+p.getdataUrodzenia() + ": " + p.getplec());
        }
        for (Osoba p : ludzie) {
            System.out.println(p.getdataUrodzenia() + ": " + p.getplec());
        }
    }
}

