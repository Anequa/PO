package pl.imiajd.Ged;
import java.time.LocalDate;

public class Osoba  implements Cloneable, Comparable<Osoba> {
    private String Nazwisko;
    private LocalDate dataUrodzenia;
    public Osoba(String nazwisko,LocalDate dataUrodzenia)
    {
        this.Nazwisko=nazwisko;
        this.dataUrodzenia=dataUrodzenia;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
    @Override
    protected Osoba clone() throws CloneNotSupportedException {
        Osoba cloned = (Osoba) super.clone();
        return cloned;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }


    @Override
    public String toString() {
        return "Osoba{" + "["+ Nazwisko + '\'' +
                  dataUrodzenia +"]}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null)return false;
        if (!(obj instanceof Osoba)) return false;
        Osoba nazwa=(Osoba)obj;
        return (nazwa.Nazwisko.equals(this.Nazwisko) && nazwa.dataUrodzenia.equals(this.dataUrodzenia));
    }
    @Override
    public int compareTo(Osoba nazwa){
    int compare_nazwisko= this.Nazwisko.compareTo(nazwa.Nazwisko);
        if(compare_nazwisko==0){
        return this.dataUrodzenia.compareTo(nazwa.dataUrodzenia);
    }
        return compare_nazwisko;
}
}
