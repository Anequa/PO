package pl.imiajd.ged;

import java.time.LocalDate;

class Flet extends Instrument {

    public Flet(String producent, LocalDate rokprodukcji) {
        super(producent, rokprodukcji);
    }

    @Override
    public String dzwiek() {
        return "fiufiu";
    }
}
