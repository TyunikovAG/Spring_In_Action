package ru.tyunikovag.springinaction.springidol.instruments;

public class Piano extends Instrument {

    public void play() {
        System.out.printf("Piano %1$s, piano %1$s, piano %1$s\n", super.NOTA);
    }
}
