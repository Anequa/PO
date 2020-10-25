package ged.ania.lekcja04;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class zad2 {

       public static int policz(String nazwaPliku,char znak)
       {
           int licznik=0;
           zad1 zad1= new zad1();
           try
           {
               File plik = new File(nazwaPliku);
               Scanner readFile = new Scanner(plik);
               while(readFile.hasNextLine())
               {
                   String tekst = readFile.nextLine();
                   licznik+=zad1.countChar(tekst,znak);
               }
               readFile.close();
           }
           catch (FileNotFoundException e)
           {
               System.out.println("Error");
               e.printStackTrace();
           }
           return licznik;
       }
    public static int policzwyraz(String nazwaPliku,String znak)
    {
        int licznik=0;
        zad1 zad1= new zad1();
        try
        {
            File plik = new File(nazwaPliku);
            Scanner readFile = new Scanner(plik);
            while(readFile.hasNextLine())
            {
                String tekst = readFile.nextLine();
                licznik+=zad1.countSubStr(tekst,znak);
            }
            readFile.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error");
            e.printStackTrace();
        }
        return licznik;
    }
}

