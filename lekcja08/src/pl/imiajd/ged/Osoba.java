package pl.imiajd.ged;
import java.time.LocalDate;


abstract class Osoba
{
    public Osoba(String nazwisko, String imiona[], LocalDate dataUrodzenia, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imiona=imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }
    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }
    public String[] getimiona(){return imiona;}
    public LocalDate getdataUrodzenia(){return dataUrodzenia;}
    public boolean getplec(){return plec;}


    private String nazwisko;
    private String imiona[];
    private LocalDate dataUrodzenia;
    private boolean plec;
}