package ru.tyunikovag.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws PerfomanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        PoeticJuggler poeticJuggler = context.getBean("poeticDuke", PoeticJuggler.class);
        Ticket ticket1 = context.getBean("ticket", Ticket.class);
        Ticket ticket2 = context.getBean("ticket", Ticket.class);
        Ticket ticket3 = context.getBean("ticket", Ticket.class);
        Ticket ticket4 = context.getBean("ticket", Ticket.class);
        Ticket ticket5 = context.getBean("ticket", Ticket.class);

        System.out.println(ticket5);
        poeticJuggler.perform();
    }
}
