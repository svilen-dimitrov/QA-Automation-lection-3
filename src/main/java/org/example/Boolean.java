package org.example;

public class Boolean {
    public static void main(String[] args) {
        boolean isValidPrice = checkPrice(4,3);
        boolean isValidPrice2 = checkPrice(10, 3);

        /*if(isValidPrice) {
            System.out.println("this is yes");
        }else {
            System.out.println("this is no");
        }*/

        if(isValidPrice && isValidPrice2){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
    public static boolean checkPrice (int number1, int number2){
        if (number1 > number2) {
            return true;
        }else {
            return false;
        }
    }
}
