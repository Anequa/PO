package pl.imiajd.ged;

public class Student extends Osoba {
    private String kierunek;
    public Student(String nazwisko,int rokUrodzenia,String kierunek)
    {
        super(nazwisko,rokUrodzenia);
        this.kierunek=kierunek;
    }
    @Override
    public String toString()
    {
        return super.toString()+this.kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }
}
