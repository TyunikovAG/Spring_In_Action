package ru.tyunikovag.springinaction.springidol.people;

import ru.tyunikovag.springinaction.springidol.exeptions.PerfomanceException;
import ru.tyunikovag.springinaction.springidol.instruments.Instrument;

import java.util.Map;

public class OneManBandMap implements Performer {

    Map<String, Instrument> instruments;

    public OneManBandMap() {
    }

    public OneManBandMap(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public void perform() throws PerfomanceException {
        if (instruments == null || instruments.isEmpty()) {
            System.out.println("Nothing to play (((");
        } else {
            for (Map.Entry<String, Instrument> instrumentEntry : instruments.entrySet()) {
                System.out.println("Play on " + instrumentEntry.getKey());
                instrumentEntry.getValue().play();
            }
        }
    }
}
