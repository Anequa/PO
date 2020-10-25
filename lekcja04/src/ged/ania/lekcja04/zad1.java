package ged.ania.lekcja04;

import java.util.Scanner;


public class zad1 {
    Scanner scan = new Scanner(System.in);

    public static int countChar(String str, char c) {
        int ile = 0;
        int znak = 0;
        for (int i = 0; i < str.length(); i++) {
            znak = str.charAt(i);
            if (znak == c) {
                ile++;
            }
        }
        return ile;

    }

    public static int countSubStr(String str, String subStr) {
        int ile = 0;
        int powtórzenia = 0;
        char ciagznaku = 0;
        char ciagznaku2 = 0;
        for (int i = 0; i < str.length(); i++) {
            ciagznaku = str.charAt(i);
            ciagznaku2 = subStr.charAt(0);
            int z = i;
            if (ciagznaku == ciagznaku2) {
                for (int j = 0; j < subStr.length(); j++) {
                    ciagznaku = str.charAt(z);
                    ciagznaku2 = subStr.charAt(j);
                    if (ciagznaku == ciagznaku2) {
                        ile++;
                        if (ile == subStr.length()) {
                            powtórzenia++;
                        }
                    }
                    z++;
                }
                ile = 0;
            }
        }
        return powtórzenia;
    }

    public static String middle(String str) {
        int dlugoscslowa = str.length();
        if (dlugoscslowa % 2 != 0) {
            return String.valueOf(str.charAt(str.length() / 2));
        } else {
            return str.substring(((dlugoscslowa / 2) - 1), ((dlugoscslowa / 2) + 1));
        }

    }

    public static String repeat(String str, int n) {
        String s = str;
        for (int i = 1; i < n; i++) {
            s = s + str;
        }
        return s;
    }

    public static int[] where(String str, String subStr) {
        int licznik2 = 0, dlugoscStr = str.length(), dlugoscSubStr = subStr.length(), c = 0;
        int[] tab = new int[countSubStr(str, subStr)];
        for (int i = 0; i < dlugoscStr; i++) {
            if (str.charAt(i) == subStr.charAt(0)) {
                for (int j = 0; j < dlugoscSubStr; j++) {
                    if (str.charAt(i + j) != subStr.charAt(j))
                        break;
                    else
                        licznik2++;
                }
                if (dlugoscSubStr == licznik2) {
                    tab[c] = i;
                }
                licznik2 = 0;
                c++;
            }
        }
        return tab;
    }

    public static String change(String str) {
        StringBuffer strb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                strb.append(String.valueOf(str.charAt(i)).toLowerCase());
            }
            if (Character.isLowerCase(str.charAt(i))) {
                strb.append(String.valueOf(str.charAt(i)).toUpperCase());
            }
        }
        return strb.toString();
    }
    public static String Nice(String str){
        StringBuffer liczby = new StringBuffer();
        int z =1;
        for(int i=(str.length()-1);i>=0;i--){
            liczby.append(str.charAt(i));
            if(z %3==0 && i!=0)  liczby.append("'");
            z++;
        }
        String temp= liczby.toString();
        liczby =new StringBuffer();
        for(int i=temp.length()-1;i>=0;i--){
            liczby.append(temp.charAt(i));
        }
        return liczby.toString();
    }
    public static String nice(String str,char znak, int n){
        StringBuffer dziesietne= new StringBuffer();
        int z =1;
        for(int i=(str.length()-1);i>=0;i--){
            dziesietne.append(str.charAt(i));
            if(z %n==0 && i!=0)  dziesietne.append(znak);
            z++;
        }
        String temp= dziesietne.toString();
        dziesietne=new StringBuffer();
        for(int i=temp.length()-1;i>=0;i--){
            dziesietne.append(temp.charAt(i));
        }
        return dziesietne.toString();
    }
}





