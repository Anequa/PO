package pl.edu.uwm.po.lab_06;

public class RachunekBankowy {
    public static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double saldo)
    {
        this.saldo = saldo;

    }

    public void ObliczMiesiesieczneOdsetki() {
        double suma;
        suma = (this.saldo * this.rocznaStopaProcentowa) / 12;
        this.saldo=this.saldo+suma;
    }
    static public void setRocznaStopaProcentowa(double value)
    {
     rocznaStopaProcentowa=value;
    }

    public double getSaldo()
    {
        return this.saldo;
    }


}
