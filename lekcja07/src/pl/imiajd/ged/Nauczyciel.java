package pl.imiajd.ged;

public class Nauczyciel extends Osoba{

    private String pensja;
    public Nauczyciel(String nazwisko,int rokUrodzenia,String kasa)
    {
        super(nazwisko,rokUrodzenia);
        this.pensja=kasa;
    }
    @Override
    public String toString()
    {
        return super.toString()+this.pensja;
    }
    public String getPensja() {
        return pensja;
    }


    }


