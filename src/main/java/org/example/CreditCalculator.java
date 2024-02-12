package org.example;

public class CreditCalculator {
    public static void main(String[] args) {
        calculateCreditDetails("Иван Иванов ", 19, 2000, 24);

    }

    private static void calculateCreditDetails(String fullName, int age, int amount, int months) {
        if (age < 18) {
            System.out.println("Трябва да имате навършени 18 години, за да изтеглите кредит");
        } else {
            if (amount < 1000) {
                if (months > 12) {
                    System.out.println("Не може да изтеглите сума под 100 лева за период по-дълъг от 12 месеца");
                } else {
                    double monthlyPayment = amount / months;
                    System.out.println("Месечна е равна на" + monthlyPayment);
                }
            } else {
                double interestRate = getInterestRate(amount);
                double totalamount = amount + (amount * interestRate * months / 12);
                double monthlyPayment = totalamount / months;
                System.out.printf("Месечна вноска за сума от %d лева за %d месеца с лихва" +
                        "%.2f%% е %.2f лева.%n", amount, months, interestRate * 100, monthlyPayment);

            }
        }
    }



    private static double getInterestRate(int amount) {
        if (amount <= 5000) {
            return 0.05; // 5% лихва за суми до 5000 лева
        } else if (amount <= 10000) {
            return 0.04; // 4% лихва за суми до 10000 лева
        } else {
            return 0.03;

        }

    }

}
