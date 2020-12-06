import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tab)
    {
        ArrayList <T>temp=new ArrayList<T>(tab);
        Collections.sort(temp);
        return tab.equals(temp);

    }
    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T>tab,T obiekt)
    {
        int min = 0;
        int max = tab.size()-1 ;
        int srodek=0;
        int ind=-1;
        while (min<=max)
        {
            srodek=(min+max)/2;
            if (tab.get(srodek).compareTo(obiekt)==0)
            {
                return ind=srodek;
            }
            else if(tab.get(srodek).compareTo(obiekt)<0)
            {
                min=srodek+1;
            }
            else if(tab.get(srodek).compareTo(obiekt)>0)
            {
                max=srodek-1;
            }
        }
        return ind;
    }
    public static <T extends Comparable<T>> void selectionSort(ArrayList<T>tab)
    {
        int size=tab.size();

        for(int i=0;i<size;i++)
        {
            T temp=tab.get(i);
            int ind=i;
            for (int j=i;j<size;j++)
            {
                if(tab.get(j).compareTo(temp)<0)
                {
                    temp=tab.get(j);
                    ind=j;
                }
            }
            tab.set(ind,tab.get(i));
            tab.set(i,temp);
        }

    }
    public static <T extends Comparable <T>> void mergeSort(ArrayList<T>tab)
    {
        ArrayList<T> left = new ArrayList<>();
        ArrayList<T> right = new ArrayList<>();
        ArrayList<T> merged=new ArrayList<>();
        int size=tab.size();
        int half=size/2;
        for (int i=0;i<half;i++)
        {
            left.add(i,tab.get(i));
            right.add(i,tab.get((size-1)-i));
        }
        if(size%2!=0)
    {
        right.add(tab.get(half));
    }
        left.sort(null);
        right.sort(null);
        System.out.println(left);
        System.out.println(right);
//            DO NAPRAWY, MIAla byc rekurencja i nic nie dziala
//        for(int j=0;j<left.size();j++)
//        {
//            for(int k=0;k<right.size();k++)
//            {
//               if( left.get(j).compareTo(right.get(k))>0) {
//               merged.add(right.get(k));}
//               else{
//                   merged.add(left.get(j));
//               }
//
//            }
//        }
//        System.out.println(merged);


    }
}
