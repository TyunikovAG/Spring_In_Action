package ru.tyunikovag.inaction;

public class Fighter implements Action{

    private String name;

    public Fighter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void doAction() {
        System.out.println(name + " do action");;
    }
}
