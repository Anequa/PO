import java.awt.*;
import java.awt.print.PrinterAbortException;
import java.util.LinkedList;

public class redukujTest {
    public static void main(String[] args) {
        LinkedList<String> pracownicy= new LinkedList<>();
        pracownicy.add("Andrzej");
        pracownicy.add("Stefan");
        pracownicy.add("Lukasz");
        pracownicy.add("Patryk");
        pracownicy.add("Jędrzej");
        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        liczby.add(5);
        liczby.add(6);
        liczby.add(7);
        liczby.add(8);
        REdukuj.odwroc(pracownicy);
        System.out.println(pracownicy);
        REdukuj.redukuj(pracownicy,2);
        System.out.println(pracownicy);
        System.out.println(REdukuj.yoda("Jem sobie sniadanie."));
        REdukuj.liczby(2016);
        REdukuj.Grecy(20);
        REdukuj.print(pracownicy);
        REdukuj.print(liczby);
}}
