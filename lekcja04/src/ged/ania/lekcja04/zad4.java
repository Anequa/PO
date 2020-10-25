package ged.ania.lekcja04;
import java.math.BigInteger;

public class zad4 {

    public static String policz(int n) {
        BigInteger start = new BigInteger("0");
        BigInteger dodajnik = new BigInteger("1");
        BigInteger mnoznik = new BigInteger("2");
        for (int i = 0; i < n * n; i++) {
            start = start.add(dodajnik);
            dodajnik = dodajnik.multiply(mnoznik);
        }
        return start.toString();
    }
}

