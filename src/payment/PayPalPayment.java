package payment;

import payment.PaymentMethod;

public class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public boolean pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        return true;
    }

    public boolean refund(double amount) {
        System.out.println("Processing refund to PayPal account of $" + amount);
        return true;
    }

    public String getPaymentDetails() {
        return "PayPal account: " + email;
    }
}