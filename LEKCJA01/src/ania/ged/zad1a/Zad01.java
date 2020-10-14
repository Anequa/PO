package ania.ged.zad1a;

import java.util.Scanner;

public class Zad01 {
    static Scanner scan = new Scanner(System.in);

    public static int pobieranieN() {
        System.out.println("Podaj liczbe n");
        int n = scan.nextInt();
        return n;
    }

    public int zad01a() {
        int n = pobieranieN();
        System.out.println("podaj n liczb do obliczenia sumy");
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += scan.nextInt();
        }
        return suma;
    }

    public int zad01b() {
        int n = pobieranieN();
        System.out.println("podaj n liczb do obliczenia mnozenia");
        int mnoz = 1;
        for (int i = 0; i < n; i++) {
            mnoz *= scan.nextDouble();
        }
        return mnoz;


    }

    public double zad01c() {
        double n = pobieranieN();
        System.out.println("podaj n liczb do obliczenia dodawania");
        double suma = 0;
        for (int i = 0; i < n; i++) {
            double z = scan.nextDouble();
            {
                suma += Math.abs(z);
            }

        }
        return suma;
    }

    public double zad01d() {
        double n = pobieranieN();
        System.out.println("podaj n liczb do obliczenia dodawania");
        double suma = 0;
        for (int i = 0; i < n; i++) {
            double z = scan.nextDouble();
            {
                suma += Math.sqrt(Math.abs(z));
            }

        }
        return suma;
    }

    public double zad01e() {
        double n = pobieranieN();
        System.out.println("podaj n liczb do obliczenia mnozenia");
        double suma = 1;
        for (int i = 0; i < n; i++) {
            double z = scan.nextDouble();
            {
                suma *= Math.abs(z);
            }

        }
        return suma;
    }

    public double zad01f() {
        double n = pobieranieN();
        System.out.println("podaj n liczb do obliczenia mnozenia");
        double suma = 0;
        for (int i = 0; i < n; i++) {
            double z = scan.nextDouble();
            {
                suma += Math.pow(z, 2);
            }

        }
        return suma;
    }

    public void zad01g() {
        double n = pobieranieN();
        System.out.println("podaj n liczb do obliczenia mnozenia");
        double suma = 0;
        double mnoz = 1;
        for (int i = 0; i < n; i++) {
            double z = scan.nextDouble();
            {
                mnoz *= z;
                suma += z;
            }

        }
        System.out.println(mnoz);
        System.out.println(suma);

    }

    public double zad01h() {
        double n = pobieranieN();
        System.out.println("podaj n liczb do obliczenia ");
        double suma = 0;
        for (int i = 0; i < n; i++) {
            double z = scan.nextDouble();
            {
                suma += Math.pow(-1, n) * z;
            }

        }
        return suma;

    }

    public double silnia(int n) {

        double s = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        return s;

    }

    public double zad01i() {
        double n = pobieranieN();
        System.out.println("podaj n liczb do obliczenia ");
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            double z = scan.nextDouble();
            {
                suma += (Math.pow(-1, i) * z) / (silnia(i));
            }

        }
        return suma;

    }


    public void zad01_2(){
        int n=pobieranieN();
        double[] tab = new double[n];
        for (int i=0;i<n;i++) {
            double z=scan.nextDouble();
            tab[i]=z;
        }
        for (int i=1;i<n;i++)
        {
            System.out.println(tab[i]);
        }
        System.out.println(tab[0]);


    }
}

