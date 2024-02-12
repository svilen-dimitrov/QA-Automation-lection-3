package org.example;

public class AgeCheker {
    public static void main(String[] args) {
        checkAge(20);
    }

    private static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Лицето е пълнолетно!");
        } else {
            System.out.println("Лицето е под 18 години!");
        }
    }
}
