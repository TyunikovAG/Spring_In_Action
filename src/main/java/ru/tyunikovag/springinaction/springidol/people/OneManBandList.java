package ru.tyunikovag.springinaction.springidol.people;

import ru.tyunikovag.springinaction.springidol.exeptions.PerfomanceException;
import ru.tyunikovag.springinaction.springidol.instruments.Instrument;

import java.util.List;

public class OneManBandList implements Performer {

    List<Instrument> instruments;

    public OneManBandList() {
    }

    public OneManBandList(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void perform() throws PerfomanceException {
        if (instruments == null || instruments.isEmpty()) {
            System.out.println("Nothing to play (((");
        } else {
            for (Instrument instrument : instruments) {
                instrument.play();
            }
        }
    }
}
