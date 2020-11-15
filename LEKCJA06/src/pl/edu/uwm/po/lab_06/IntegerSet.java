package pl.edu.uwm.po.lab_06;

import java.util.Arrays;

public class IntegerSet {
    private boolean[] tab;

    public IntegerSet() {
        tab = new boolean[100];
    }

    static IntegerSet union(IntegerSet a, IntegerSet b) {
        IntegerSet lista = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if (a.tab[i] || b.tab[i]) {
                lista.tab[i] = true;
            }

        }
        return lista;

    }
    static IntegerSet intersection(IntegerSet a,IntegerSet b)
    {
        IntegerSet lista = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if (a.tab[i] && b.tab[i]) {
                lista.tab[i] = true;
            }
        }
        return lista;

    }
    void insertElement(int value)
    {
        if(value>=0||value<100)
        {
            this.tab[value-1]=true;
        }
    }
    void deleteElement(int value)
    {
        if(value>=0||value<100)
        {
            this.tab[value-1]=false;
        }
    }

    @Override
    public String toString() {
        StringBuilder liczby= new StringBuilder();
        for (int i=0;i<100;i++)
        {
            if(this.tab[i])
            {
                liczby.append(i+1);
                liczby.append(" ");
            }
        }
        return liczby.toString();
    }


    public boolean equals(IntegerSet a) {
        return this.toString().equals(a.toString());
    }
}
