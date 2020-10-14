package ania.ged.zad1a;

import java.util.Scanner;

public class zad02 {
    Scanner scan = new Scanner(System.in);

    public int zad2a() {
        int n = Zad01.pobieranieN();
        System.out.println("podaj n liczb do obliczenia nieparz");
        int niep = 0;
        for (int i = 0; i < n; i++) {
            int z = scan.nextInt();
            if (z % 2 == 1) {
                niep++;
            }
        }
        return niep;
    }

    public int zad2b() {
        int n = Zad01.pobieranieN();
        System.out.println("podaj n liczb");
        int podz = 0;
        for (int i = 0; i < n; i++) {
            int z = scan.nextInt();
            if ((z % 3 == 0) && (z % 5 != 1)) {
                podz++;
            }
        }
        return podz;
    }

    public int zad2c() {
        int n = Zad01.pobieranieN();
        System.out.println("podaj n liczb");
        int l = 0;
        for (int i = 0; i < n; i++) {
            int z = scan.nextInt();
            if (Math.sqrt(z) % 2 == 0) {
                l++;
            }
        }
        return l;
    }

    public int zad2d() {
        int n = Zad01.pobieranieN();
        System.out.println("podaj n liczb");
        int l = 0;
        int tab[] = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = scan.nextInt();
        }
        for (int i = 1; i < n - 1; i++) {
            if (tab[i] < (tab[i - 1] + tab[i + 1]) / 2) {
                l++;
            }

        }
        return l;
    }

    int silnia(int n) {
        int i = 1;
        for (i = 1; i <= n; i++) {
            i *= i;
        }
        return i;}

        public int zad2e () {
            int n = Zad01.pobieranieN();
            int ile = 0;
            int l;
            for (int i = 1; i <= n; i++) {
                l = scan.nextInt();
                if (Math.pow(2, i) < l && l < silnia(i)) {
                    ile++;
                }
            }
            return ile;
        }

    public int zad2f () {
        int n = Zad01.pobieranieN();
        int ile = 0;
        int l;
        int tab[] = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = scan.nextInt();
        }
        for (int i = 0; i <= n; i++) {
            if (i%2==0&&tab[i]%2==0) {
                ile++;
            }
        }
        return ile;
    }
    public int zad2g () {
        int n = Zad01.pobieranieN();
        int ile = 0;
        int l;
        int tab[] = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (tab[i]%2!=0&&tab[i]>0) {
                ile++;
            }
        }
        return ile;
    }
    public int zad2h () {
        int n = Zad01.pobieranieN();
        int ile = 0;
        int l;
        int tab[] = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (Math.abs(tab[i])<Math.pow(i,2)) {
                ile++;
            }
        }
        return ile;
    }
}



