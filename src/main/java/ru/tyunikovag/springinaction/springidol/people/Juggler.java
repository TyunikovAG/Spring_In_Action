package ru.tyunikovag.springinaction.springidol.people;

import ru.tyunikovag.springinaction.springidol.exeptions.PerfomanceException;

public class Juggler implements Performer {

    private int beanBags;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() throws PerfomanceException {
        System.out.println("Juggling " + beanBags + " beanbags");
    }
}
