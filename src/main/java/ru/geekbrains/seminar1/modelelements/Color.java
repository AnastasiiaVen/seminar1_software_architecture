package ru.geekbrains.seminar1.modelelements;

public class Color {

    static int counter = 0;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Color(String name) {
        this.name = name;
    }

    {
        id = ++counter;
    }
}
