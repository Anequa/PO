package pl.edu.uwm.po.lab_06;

public class TestRachunekBankowy {
    public static void main(String[] args) {


    RachunekBankowy saver1 = new RachunekBankowy(2000);
    RachunekBankowy saver2 = new RachunekBankowy(3000);
    RachunekBankowy.setRocznaStopaProcentowa(0.04);
    saver1.ObliczMiesiesieczneOdsetki();
    saver2.ObliczMiesiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());
    RachunekBankowy.setRocznaStopaProcentowa(0.05);
    saver1.ObliczMiesiesieczneOdsetki();
    saver2.ObliczMiesiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        System.out.println(saver2.getSaldo());

}}
