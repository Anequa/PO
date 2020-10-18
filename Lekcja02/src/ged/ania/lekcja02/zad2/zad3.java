package ged.ania.lekcja02.zad2;

import java.util.Scanner;

public class zad3 {
    public static void przypiszliczby(int macierz[][],int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                macierz[i][j] = (int) (Math.random() * (10 - 1 + 1) + 1);
            }
        }
    }

    public static void wypisz(int tab[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                System.out.print(tab[i][j]+", ");
            }
            System.out.println("]");
        }
    }

    public static void macierz(int m, int n, int k) {


        if ((m > 10 || m < 1) || (n > 10 || n < 1) || (k > 10 || k < 1)) {
            System.out.println("bledne dane");
        } else {
            int[][] macierz = new int[m][n];
            przypiszliczby(macierz,m, n);
            int[][] macierz2 = new int[n][k];
            int[][] macierz3 = new int[m][k];
            przypiszliczby(macierz2,n, k);
            wypisz(macierz, m, n);
            wypisz(macierz2, n, k);
            int mnoz = 0;
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    mnoz=0;
                    for (int g = 0; g < n; g++)
                    {
                        mnoz += macierz[i][j] * macierz2[j][i];
                    }
                    macierz3[i][j]=mnoz;
                }
            }
            System.out.println(":");
            wypisz(macierz3,m,k);
        }

    }
}
