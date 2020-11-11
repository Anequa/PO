package pl.imiajd.ged;

import java.time.LocalDate;

abstract class Instrument {
    public Instrument(String producent, LocalDate rokprodukcji)
    {
        this.producent=producent;
        this.rokprodukcji=rokprodukcji;
    }

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokprodukcji() {
        return rokprodukcji;
    }
    public abstract String dzwiek();

    @Override
    public boolean equals(Object obj) {
        return this.dzwiek().equals(obj);
    }

    @Override
    public String toString() {
        return "producent: "+producent+" rokprodukcji: "+rokprodukcji;
    }

    private String producent;
    private LocalDate rokprodukcji;
}
