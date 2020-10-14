package ania.ged.zad1a;

import java.util.Scanner;

public class Zad02do05 {
    static Scanner scan = new Scanner(System.in);

    public static int zad02() {
        int n = Zad01.pobieranieN();
        int tab[] = new int[n];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            tab[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (tab[i] >= 0) {
                suma += tab[i] * 2;
            }

        }
        return suma;

    }

    public static void zad03() {
        int n = Zad01.pobieranieN();
        int tab[] = new int[n];
        int sumadod = 0;
        int sumauj = 0;
        int sumazer = 0;
        for (int i = 0; i < n; i++) {
            tab[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (tab[i] == 0) {
                sumazer++;
            } else if (tab[i] > 0) {
                sumadod++;
            } else {
                sumauj++;
            }


        }
        System.out.println("suma zer:" + sumazer + "suma dodat" + sumadod + "suma uj:" + sumauj);


    }

    public static  void zad04() {
        int n = Zad01.pobieranieN();
        int tab[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            tab[i] = scan.nextInt();
        }
        int najm=tab[0];
        int najw=tab[0];
        for (i = 0; i < n; i++) {
            if (najm> tab[i]) {
                najm=tab[i];
            }
            if (najw< tab[i]) {
                najw=tab[i];
            }

        }
        System.out.println("najm:"+najm+"najw:"+najw);

    }
    public static  void zad05() {
        int n = Zad01.pobieranieN();
        int tab[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            tab[i] = scan.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if (tab[i] > 0 && tab[i+1]>0) {
                System.out.println("para ("+tab[i]+","+tab[i+1]+")");

            }
        }

    }
}
