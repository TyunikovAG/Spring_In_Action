package ru.tyunikovag.springinaction.springidol.instruments;

public class Saxophone extends Instrument {

    public void play() {
        System.out.printf("POM %1$s - POM %1$s - POM %1$s\n", super.NOTA);
    }
}
