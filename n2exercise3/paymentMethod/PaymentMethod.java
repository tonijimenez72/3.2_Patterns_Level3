package n2exercise3.paymentMethod;

import n2exercise3.callback.PaymentCallback;

public interface PaymentMethod {
    void processPayment(int amount, PaymentCallback paymentCallback);
}
