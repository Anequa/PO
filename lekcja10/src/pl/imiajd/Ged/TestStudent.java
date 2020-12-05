package pl.imiajd.Ged;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ArrayList<Osoba> lista = new ArrayList<>();
        lista.add(new Student("Jan", LocalDate.of(2000,11,12),3.12));
        lista.add(new Student("Janek", LocalDate.of(2001,12,22),4.44));
        lista.add(new Student("Janusz", LocalDate.of(2000,11,12),2.0));
        lista.add(lista.get(0).clone());
        lista.add(new Student("Jan", LocalDate.of(2004,04,22),5.0));
        System.out.println(lista.get(0).equals(lista.get(3)));
        System.out.println(lista.get(0).equals(lista.get(4)));
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        if (args.length==0)
        {
            ArrayList<String> zadanie3 = new ArrayList<>();
            try
            {
                File plik = new File("D:\\szkola\\test.txt");
                Scanner wczytywanie = new Scanner(plik);
                while (wczytywanie.hasNextLine())
                {
                    zadanie3.add(wczytywanie.nextLine());
                }
                wczytywanie.close();
            }catch (FileNotFoundException error)
            {
                System.out.println("taki plik nie istnieje");
                error.printStackTrace();
            }
            System.out.println(zadanie3);
            Collections.sort(zadanie3);
            System.out.println(zadanie3);
        }
        }
    }


