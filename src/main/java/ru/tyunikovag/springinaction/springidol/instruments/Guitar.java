package ru.tyunikovag.springinaction.springidol.instruments;

public class Guitar extends Instrument {
    public void play() {
        System.out.printf("Brin %1$s brin %1$s drin %1$s\n", NOTA);
    }
}
