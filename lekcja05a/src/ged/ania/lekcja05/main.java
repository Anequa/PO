package ged.ania.lekcja05;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class main {
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(5,6,7));
        zad1 z1=new zad1();
//        ArrayList<Integer> l3=z1.append(l1,l2);
//        z1.print(l3);
//        ArrayList<Integer>l4=z1.merge(l1,l2);
//        z1.print(l4);
//        ArrayList<Integer>l5=z1.mergeSorted(l1,l2);
//        z1.print(l5);
//        ArrayList<Integer>l6=z1.reversed(l1);
//        z1.print(l6);
        z1.reverse(l1);
        System.out.println(l1);


    }
}
