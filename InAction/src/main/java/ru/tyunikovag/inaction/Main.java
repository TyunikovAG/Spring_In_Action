package ru.tyunikovag.inaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Action action = context.getBean("fighter", Action.class);
        action.doAction();
    }
}