package ru.tyunikovag.springinaction.springidol;

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
