package pl.imiajd.ged;
import java.time.LocalDate;


class Student extends Osoba
{
    public Student(String nazwisko, String imiona[], LocalDate dataUrodzenia, boolean plec, String kierunek, double sredniaocen)
    {
        super(nazwisko,imiona,dataUrodzenia,plec);
        this.kierunek = kierunek;
        this.sredniaocen=sredniaocen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }
    public double getsredniaocen()
    {
        return sredniaocen;
    }
    public void setsredniaocen(double a)
    {
        this.sredniaocen=a;
    }


    private String kierunek;
    private double sredniaocen;
}
