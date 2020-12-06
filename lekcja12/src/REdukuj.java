import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class REdukuj {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n) {
        LinkedList<T> temp = new LinkedList<>(pracownicy);
        LinkedList<T> temp2 = new LinkedList<>(pracownicy);
        for (int i = 0; i < pracownicy.size(); i += n - 1) {
            temp.remove(i);
            temp2 = temp;
            temp = pracownicy;
        }

    }

    public static <T> void odwroc(LinkedList<T> lista) {
        LinkedList<T> temp = new LinkedList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            temp.add(lista.get(i));
        }

        for (int j = 0; j < lista.size(); j++) {
            lista.set(j, temp.get(j));

        }

    }

    public static String yoda(String tekst) {
        List<String> listaZdan = Arrays.asList(tekst.split(" "));
        Stack<String> stos = new Stack<>();
        Iterator<String> iter = listaZdan.listIterator();
        StringBuilder zdanie = new StringBuilder("");

        while (iter.hasNext()) {
            String elem = iter.next();
            stos.push(elem);
            if (elem.endsWith(".")) {

                String first = stos.pop().replace('.', ' ');
                first = first.substring(0, 1).toUpperCase() + first.substring(1);
                zdanie.append(first);

                while (!stos.isEmpty()) {
                    zdanie.append(stos.pop().toLowerCase());
                    if (!stos.isEmpty()) {
                        zdanie.append(" ");
                    }
                }
                zdanie.append(". ");
            }
        }
        return zdanie.toString();
    }

    public static void liczby(int liczba) {
        Stack<Integer> stos = new Stack<>();
        while (liczba != 0) {
            stos.add(liczba % 10);
            liczba = liczba / 10;
        }
        while (!stos.isEmpty()) {
            System.out.print(stos.pop() + " ");
        }
        System.out.println();
    }

    public static void Grecy(int n) {
        ArrayList<Integer> liczby = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            liczby.add(i);
        }
        Iterator<Integer> zbior = liczby.iterator();
        int temp = 2;
        while (temp<=Math.sqrt(n)) {
            while(zbior.hasNext()){
                int liczba=zbior.next();

                if (liczba != temp && liczba % temp == 0)
               {
                    zbior.remove();
               }
               }
            temp++;
            zbior=liczby.iterator();
            }
        System.out.println(liczby);
        }



    public static<T extends Iterable<?>>void print(T obj)
    {
        Iterator<?> i = obj.iterator();
        int tmp = 0;
        while (i.hasNext()){
            System.out.print(i.next());
            if (i.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    }



