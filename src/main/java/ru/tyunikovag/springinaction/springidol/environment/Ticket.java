package ru.tyunikovag.springinaction.springidol.environment;

public class Ticket {

    private static int number;
    private final int price;

    public Ticket(int price) {
        number++;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Tiket #%8d for %d$", number, price);
    }
}
