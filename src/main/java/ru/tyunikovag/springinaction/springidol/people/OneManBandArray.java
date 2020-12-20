package ru.tyunikovag.springinaction.springidol.people;

import ru.tyunikovag.springinaction.springidol.exeptions.PerfomanceException;
import ru.tyunikovag.springinaction.springidol.instruments.Instrument;

import java.util.List;

public class OneManBandArray implements Performer {

    Instrument[] instruments;

    public OneManBandArray() {
    }

    public OneManBandArray(Instrument[] instruments) {
        this.instruments = instruments;
    }

    public void setInstruments(Instrument[] instruments) {
        this.instruments = instruments;
    }

    public void perform() throws PerfomanceException {
        if (instruments == null || (instruments.length == 0)) {
            System.out.println("Nothing to play (((");
        } else {
            for (Instrument instrument : instruments) {
                instrument.play();
            }
        }
    }
}
