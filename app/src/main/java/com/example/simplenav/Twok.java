package com.example.simplenav;

public class Twok {
    public String name, text;

    public Twok(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Twok{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
