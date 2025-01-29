package n2exercise3.paymentMethod;

import n2exercise3.callback.PaymentCallback;


public class PaypalPaymentMethod implements PaymentMethod {
    public void processPayment(int amount, PaymentCallback paymentCallback) {
        if (amount > 0) {
            System.out.println("Processing PayPal payment...");
            paymentCallback.onPaymentSuccess(amount);
        } else {
            paymentCallback.onPaymentFailure("Invalid amount for PayPal payment.");
        }
    }
}
