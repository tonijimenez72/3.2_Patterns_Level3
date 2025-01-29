package n2exercise3.callback;

public interface PaymentCallback {
    void onPaymentSuccess(int amount);
    void onPaymentFailure(String errorMessage);
}