package ged.ania.lekcja02.zad2;

import java.util.Scanner;

public class zad2 {
    Scanner scan = new Scanner(System.in);

    public static void wypisz(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println("slot nr" + i + ": " + tab[i]);
        }
    }


    public static void generuj(int tab[], int n, int min, int max) {
        if (n > 100 || n < 1) {
            System.out.println("podaj liczbe z przedziału 1<n<100");
        }
        for (int i = 0; i < n; i++) {
            tab[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }

    public static int zad2_1(int tab[]) {
        int niep = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {

            } else {
                niep++;
            }
        }
        return niep;

    }

    public static int zad2_2(int tab[]) {
        int p = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0)
                p++;


        }
        return p;
    }

    public static int zad2_3(int tab[]) {
        int d = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                d++;


        }
        return d;
    }

    public static int zad2_4(int tab[]) {
        int u = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                u++;


        }
        return u;
    }

    public static int zad2_5(int tab[]) {
        int z = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0)
                z++;


        }
        return z;
    }

    public static int zad2_6(int tab[]) {
        int z = tab[0];
        int c = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > z)
                z = tab[i];
            for (i = 0; i < tab.length; i++) {
                if (tab[i] == z)
                    c++;


            }

        }
        return c;
    }

    public static int zad2_7(int tab[]) {
        int z = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                z += tab[i];
        }
        return z;
    }

    public static int zad2_8(int tab[]) {
        int z = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0)
                z += tab[i];
        }
        return z;
    }

    public static int zad2_9(int tab[]) {
        int z = 0;
        int p = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= 0)
                z++;

            else if (tab[i] < 0) {

                if (z > p)
                    p = z;

                z = 0;

            }
        }
        if (z > p) {
            return z;
        } else {
            return p;
        }
    }

    public static void zad2_10(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                tab[i] = -1;
                System.out.println(tab[i]);
            } else {
                tab[i] = 1;
                System.out.println(tab[i]);
            }
        }

    }

    public static void zad2_11(int tab[], int lewy, int prawy) {
        if ((lewy < 1 || lewy > tab.length) || (prawy < 1 || prawy > tab.length)) {
            System.out.println("zla liczba");
        } else {
            int r = 0;
            int p = 0;
            for (int i = lewy; i <= prawy - lewy; i++) {
                p = tab[i];
                tab[i] = tab[prawy - r];
                tab[prawy - r] = p;

                r++;

            }
            for (int i = 0; i < tab.length; i++) {
                System.out.println(tab[i]);
            }
        }

    }

}

//    public static int zad2_10(int tab[]) {
//        for (int i = 0; i < tab.length; i++) {
//            if (tab[i] > 0)
//                tab[i]=;
//        }
//        return z;
//    }



