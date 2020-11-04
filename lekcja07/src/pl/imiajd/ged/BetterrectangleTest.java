package pl.imiajd.ged;

import java.sql.SQLOutput;

public class BetterrectangleTest {
    public static void main(String[] args) {
        BetterRectangle bt = new BetterRectangle(2, 2, 6, 4);
        System.out.println(bt.getPerimeter());
        System.out.println(bt.GetArea());
    }

}
