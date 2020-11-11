package pl.imiajd.ged;

import java.time.LocalDate;

public class Skrzypce extends Instrument {
    public Skrzypce(String producent, LocalDate rokprodukcji) {
        super(producent, rokprodukcji);
    }

    @Override
    public String dzwiek() {
        return "iuiuuuuuu";
    }
}
