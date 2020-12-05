package pl.imiajd.Ged;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>
{
    private double srednia;

    public Student(String nazwisko, LocalDate dataUrodzenia,double srednia)
    {
        super(nazwisko, dataUrodzenia);
        this.srednia=srednia;
    }

    public double getSrednia() {
        return srednia;
    }

    public void setSrednia(double srednia) {
        this.srednia = srednia;
    }
    @Override
    protected Osoba clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public int compareTo(Osoba other){
        Student nazwa=(Student)other;
        int compared=super.compareTo(nazwa);
        if (compared==0)
        {
            if(this.srednia<nazwa.getSrednia())return -1;
            if(this.srednia>nazwa.getSrednia())return 1;
        }
        return compared;

    }
    @Override
    public String toString()
    {
        return super.toString()+"["+"srednia:"+this.srednia+"]\n";
    }
}
