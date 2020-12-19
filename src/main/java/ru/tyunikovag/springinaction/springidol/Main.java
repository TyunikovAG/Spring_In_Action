package ru.tyunikovag.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws PerfomanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Juggler juggler = context.getBean("duke", Juggler.class);
        juggler.perform();
    }
}
