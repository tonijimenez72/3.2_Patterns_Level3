package n2exercise3.shoeStore;

import n2exercise3.paymentMethod.BankDebitPaymentMethod;
import n2exercise3.paymentMethod.CreditCardPaymentMethod;
import n2exercise3.paymentMethod.PaymentMethod;
import n2exercise3.paymentMethod.PaypalPaymentMethod;
import n2exercise3.callback.PaymentCallback;
import n2exercise3.callback.PaymentGateway;

import java.util.Scanner;

public class ShoeStore {
    public void showMenu() {
        String menu = """
                \nShoe Store Menu
                Select a payment method:
                1. Bank Debit
                2. Credit Card
                3. PayPal
                0. Exit
                Enter your choice:
                """;
        System.out.print(menu);
    }

    public void run() {
        PaymentGateway gateway = new PaymentGateway();
        PaymentMethod paymentMethod = null;

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (true) {
            showMenu();

            choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("bye!");
                return;
            }

            System.out.println("Enter the amount to pay:");
            int amount = scanner.nextInt();

            switch (choice) {
                case 1 -> paymentMethod = new BankDebitPaymentMethod();
                case 2 -> paymentMethod = new CreditCardPaymentMethod();
                case 3 -> paymentMethod = new PaypalPaymentMethod();
                default -> {
                    System.out.println("Invalid choice. Try again.");
                    continue;
                }
            }

            paymentMethod.processPayment(amount, gateway);
        }
    }
}