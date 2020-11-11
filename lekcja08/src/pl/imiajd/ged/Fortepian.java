package pl.imiajd.ged;

import java.time.LocalDate;

public class Fortepian extends Instrument {
    public Fortepian(String producent, LocalDate rokprodukcji) {
        super(producent, rokprodukcji);
    }

    @Override
    public String dzwiek() {
        return "tudududu";
    }
}
