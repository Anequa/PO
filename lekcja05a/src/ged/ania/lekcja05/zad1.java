package ged.ania.lekcja05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class zad1 {
    public static void print(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));

        }
        System.out.println();

    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> extendedList = new ArrayList<>();
        extendedList.addAll(a);
        extendedList.addAll(b);
        return extendedList;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> naprzemian = new ArrayList<>();
        int rozmiar1 = a.size();
        int rozmiar2 = b.size();
        int max = rozmiar2;
        if (rozmiar1 > rozmiar2) {
            max = rozmiar1;
        }
        for (int i = 0; i < max; i++) {


            if (i < rozmiar1) {
                naprzemian.add(a.get(i));
            }

            if (i < rozmiar2) {
                naprzemian.add(b.get(i));
            }


        }
        return naprzemian;


    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> sorted = new ArrayList<>();
        sorted=merge(a,b);
        Collections.sort(sorted);
        return sorted;

    }
    public static ArrayList<Integer> reversed(ArrayList<Integer> a)
    {
        ArrayList<Integer> reversed = new ArrayList<>();
        for(int i=a.size()-1;i>=0;i--)
        {
            reversed.add(a.get(i));
        }
        return reversed;
    }
    public static void reverse(ArrayList<Integer> a)
    {
        for(int i=0;i<a.size();i++)
        {
            a.add(i,a.get(a.size()-1));
            a.remove(a.size()-1);
        }

    }

}




