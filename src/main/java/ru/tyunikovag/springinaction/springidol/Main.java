package ru.tyunikovag.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.tyunikovag.springinaction.springidol.exeptions.PerfomanceException;
import ru.tyunikovag.springinaction.springidol.people.OneManBandArray;
import ru.tyunikovag.springinaction.springidol.people.OneManBandMap;
import ru.tyunikovag.springinaction.springidol.people.Performer;

public class Main {

    public static void main(String[] args) throws PerfomanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Performer performer = context.getBean("mapper", OneManBandMap.class);
        performer.perform();

    }
}
