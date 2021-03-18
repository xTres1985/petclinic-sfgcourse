package com.randomgreetingsgenerator.randomgreetingsgenerator.greetings;

import java.util.Arrays;
import java.util.Random;

public class Greetings {


    Random r = new Random();

    private String greetings[] = {
            "HELLO",
            "HOLA",
            "CZOLEM",
            "CZESC",
            "JAK SIE MASZ?",
            "WITAM",
            "JAK LECI",
            "SKONT KLIKASH",
            "CO TAM?",
            "JOŁ",
            "hEjKa!!1"
    };

    public String[] getGreetings() {
        return greetings;
    }

    public void setGreetings(String[] greetings) {
        this.greetings = greetings;
    }

    public String getRandomGreeting (int i) {

        return greetings[i];
    }

    @Override
    public String toString() {
        return "Greetings{" +
                "greetings=" + Arrays.toString(greetings) +
                '}';
    }
}
