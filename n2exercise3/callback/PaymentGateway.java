package n2exercise3.callback;

public class PaymentGateway implements PaymentCallback {
    @Override
    public void onPaymentSuccess(int amount) {
        System.out.println("Payment successful. Amount: " + amount);
    }

    @Override
    public void onPaymentFailure(String errorMessage) {
        System.out.println("Payment failed: " + errorMessage);
    }
}