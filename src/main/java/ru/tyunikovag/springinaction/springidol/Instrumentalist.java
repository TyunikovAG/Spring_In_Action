package ru.tyunikovag.springinaction.springidol;

public class Instrumentalist implements Performer{

    private String song;
    private Instrument instrument;

    public void perform() throws PerfomanceException {
        System.out.printf("Playing \"%s\" song : ", song);
        instrument.play();
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
