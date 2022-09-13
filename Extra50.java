package itgeneration.progacademy.extratask;
/*
    - користувач вводить курс Bitcoin до доллара
    - користувач вводить суму доларів, що хоче поміняти на Bitcoin
    - програма повертає кількість Bitcoin, що можна купити на вказану суму.
*/

import java.util.Scanner;

public class Extra50 {
    public static void main(String[] args) {
        double BTCprice = 0, dollarsAmount;
        boolean priceEntered = false;

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                if (!priceEntered) {
                    System.out.println("What is Bitcoin price today?");
                    if (scanner.hasNextDouble()) {
                        BTCprice = scanner.nextDouble();
                        if (BTCprice <= 0) throw new Exception("Price is invalid");
                    } else {
                        System.out.println("You've entered wrong value, please try again");
                        scanner.next();
                        continue;
                    }
                    priceEntered = true;
                }

                System.out.println("How much $ do you have?");
                if (scanner.hasNextDouble()) {
                    dollarsAmount = scanner.nextDouble();
                    if (dollarsAmount <= 0) throw new Exception("You're poor");
                }
                else {
                    System.out.println("You've entered wrong value, please try again");
                    scanner.next();
                    continue;
                }

                System.out.printf("You can buy %f BTC", dollarsAmount / BTCprice);
                break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + ", you cannot buy Bitcoin right now");
        }
    }
}
