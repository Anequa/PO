package pl.imiajd.ged;
public class Adres {
    private String ulica;
    private int numer_domu;
    private String miasto;
    private int kod_pocztowy;
    private int numer_mieszkania;
    public Adres(String ulica,int numer_domu,String miasto,int kod_pocztowy,int numer_mieszkania)
    {
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
        this.numer_mieszkania=numer_mieszkania;

    }
    public Adres(String ulica,String miasto,int kod_pocztowy)
    {
        this.ulica=ulica;
        this.miasto=miasto;
        this.numer_domu=numer_domu;
        this.kod_pocztowy=kod_pocztowy;

    }
    public void pokaz ()
    {
        System.out.println(this.miasto+" "+this.kod_pocztowy);
        if(this.numer_mieszkania!=0)
        {
            System.out.println((this.ulica+this.numer_domu+"/"+this.numer_mieszkania));
        }
        else
            {
                System.out.println((this.ulica+this.numer_domu));
            }

    }
    public boolean przed(int kod)
    {
        if (kod<this.kod_pocztowy)
        {
            return true;
        }
        return false;
    }




}
