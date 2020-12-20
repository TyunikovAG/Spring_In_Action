package ru.tyunikovag.springinaction.springidol.people;

import ru.tyunikovag.springinaction.springidol.exeptions.PerfomanceException;
import ru.tyunikovag.springinaction.springidol.Poem;

public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerfomanceException {
        super.perform();
        System.out.println("While reciting ... ");
        poem.recite();
    }
}
