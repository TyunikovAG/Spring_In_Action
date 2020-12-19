package ru.tyunikovag.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws PerfomanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        PoeticJuggler poeticJuggler = context.getBean("poeticDuke", PoeticJuggler.class);
        poeticJuggler.perform();
    }
}
