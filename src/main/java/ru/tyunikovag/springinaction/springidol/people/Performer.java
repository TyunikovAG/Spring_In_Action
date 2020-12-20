package ru.tyunikovag.springinaction.springidol.people;

import ru.tyunikovag.springinaction.springidol.exeptions.PerfomanceException;

public interface Performer {

    void perform() throws PerfomanceException;
}
