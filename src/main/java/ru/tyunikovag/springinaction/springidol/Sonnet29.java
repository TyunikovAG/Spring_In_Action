package ru.tyunikovag.springinaction.springidol;

public class Sonnet29 implements Poem {

    private String[] poem = new String[] {
            "Line #1 of sonnet #29",
            "Line #2 of sonnet #29",
            "Line #3 of sonnet #29"
    };

    public void recite() {
        for (String string : poem) {
            System.out.println(string);
        }
    }
}
