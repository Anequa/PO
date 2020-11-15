package pl.edu.uwm.po.lab_06;

public class TestIntegerSet {
    public static void main(String[] args) {
        IntegerSet test = new IntegerSet();
        IntegerSet test2 = new IntegerSet();
        int[] tab = {1, 12, 2, 30, 21, 15, 71, 91};

        for (int l : tab)
        {
            test.insertElement(l);
            test2.insertElement(l);

        }
        System.out.println(test.equals(test2));
        System.out.println(test.toString());
        test2.deleteElement(12);
        System.out.println(test.equals(test2));

    }
}
