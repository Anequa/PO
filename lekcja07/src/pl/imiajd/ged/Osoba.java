package pl.imiajd.ged;

public class Osoba {
    private String nazwisko;
    private int rok_urodzenia;

    public Osoba(String nazwisko, int rokurodzenia){
        this.nazwisko = nazwisko;
        this.rok_urodzenia = rokurodzenia;
    }
    @Override
    public String toString()
    {
        return this.nazwisko+" "+this.rok_urodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRokUrodzenia() {
        return rok_urodzenia;
    }
}
