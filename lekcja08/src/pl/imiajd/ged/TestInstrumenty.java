package pl.imiajd.ged;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[]args){
    ArrayList<Instrument> instrumenty=new ArrayList<>();
    instrumenty.add(new Fortepian("jup",LocalDate.of(2000,01,01)));
    instrumenty.add(new Fortepian("oj",LocalDate.of(2050,11,11)));
    instrumenty.add(new Flet("trum",LocalDate.of(2003,01,31)));
    instrumenty.add(new Skrzypce("sum",LocalDate.of(2002,01,01)));
    instrumenty.add(new Skrzypce("perwol",LocalDate.of(2002,01,01)));
    for (Instrument i:instrumenty)
    {
        System.out.println(i.dzwiek());
        System.out.println(i);
    }
        System.out.println(instrumenty.get(0).equals(instrumenty.get(1).dzwiek()));

}}
