package org.example;

public class Lottery {
    public static void main(String[] args) {
        chekText("lottery", "test");
    }

    public static void chekText(String text, String text2) {
        if (text.equals("text2"))
            System.out.println("Вие печелите голямата награда");
        else {
            System.out.println("Опитайте пак");
        }
    }

}
