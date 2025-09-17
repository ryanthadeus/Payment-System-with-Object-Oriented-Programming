package payment;

import payment.PaymentMethod;
import payment.*;

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment("1234567890123456", "Ryan Thadeus");
        PaymentMethod payPal = new PayPalPayment("b1nu5.b1nu5@binus.ac.id");

        System.out.println(creditCard.getPaymentDetails());
        creditCard.pay(100.00);
        creditCard.refund(50.00);

        System.out.println(payPal.getPaymentDetails());
        payPal.pay(75.00);
        payPal.refund(25.00);
    }
}