import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtilDemo {
    public static void main(String[] args)
    {
        ArrayList<LocalDate>a=new ArrayList<>();
        a.add(LocalDate.of(2000,8,21));
        a.add(LocalDate.of(2000,8,10));
        a.add(LocalDate.of(2000,8,11));
//        System.out.println((ArrayUtil.isSorted(a)));
//        Collections.sort(a);
//        System.out.println(ArrayUtil.isSorted(a));
        ArrayList<Integer>b=new ArrayList<>();
        b.add(1);
        b.add(3);
        b.add(-1);
        b.add(12);
        b.add(4);
        b.add(1);
        b.add(3);
        ArrayUtil.mergeSort(b);
        System.out.println(ArrayUtil.isSorted(b));
        ArrayUtil.selectionSort(b);
//        System.out.println((ArrayUtil.isSorted(b)));
//        Collections.sort(b);
        System.out.println(ArrayUtil.isSorted(b));
        System.out.println((ArrayUtil.binSearch(b,-1)));




    }
}
