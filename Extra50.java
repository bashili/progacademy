package itgeneration.progacademy.extratask;
/*
    - користувач вводить курс Bitcoin до доллара
    - користувач вводить суму доларів, що хоче поміняти на Bitcoin
    - програма повертає кількість Bitcoin, що можна купити на вказану суму.
*/

import java.util.Scanner;

public class Extra50 {
    public static void main(String[] args) {
        double BTCprice, dollarsAmount;
        Scanner scanner = new Scanner(System.in);

        BTCprice = input(false, scanner);
        dollarsAmount = input(true, scanner);
        scanner.close();

        if (BTCprice <= 0) System.out.println("Price is invalid, you cannot buy Bitcoin.");
        else if (dollarsAmount <= 0) System.out.println("You're poor, you cannot buy Bitcoin.");
        else System.out.printf("You can buy %f BTC", dollarsAmount / BTCprice);
    }

    public static double input(boolean priceEntered, Scanner scanner) {
            while (true) {
                if (!priceEntered) System.out.println("What is Bitcoin price today?");
                else System.out.println("How much $ do you have?");

                if (scanner.hasNextDouble())
                    return scanner.nextDouble();
                else {
                    System.out.println("You've entered wrong value, please try again:");
                    scanner.next();
                }
            }
    }
}
