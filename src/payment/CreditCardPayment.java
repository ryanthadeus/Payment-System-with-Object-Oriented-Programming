package payment;

import payment.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public boolean pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        return true;
    }

    public boolean refund(double amount) {
        System.out.println("Processing refund to credit card of $" + amount);
        return true;
    }

    public String getPaymentDetails() {
        return "Credit Card: **** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }
}
