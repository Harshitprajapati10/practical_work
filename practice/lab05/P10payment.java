package practice.lab05;
/**
 * Create an interface PaymentMethod with a method void pay(double amount).
Implement this interface in two classes: CreditCardPayment and PayPalPayment.
Write a class OnlineStore that accepts a PaymentMethod in its constructor and uses it to
process a payment.
 */

interface PaymentMethod{
    void pay(double amount);
}
class CreditCardPayment implements PaymentMethod{
    private String cardNumber;
    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount){
            System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }
}

class PayPalPayment implements PaymentMethod {
    private String email;

    PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account: " + email);
    }
}

class OnlineStore {
    private PaymentMethod paymentMethod;

    // Constructor accepts any PaymentMethod
    OnlineStore(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Process payment
    void checkout(double amount) {
        paymentMethod.pay(amount);
    }
}

public class P10payment {
    public static void main(String[] args) {
        PaymentMethod ccPayment = new CreditCardPayment("1234-5678-9876-5432");
        PaymentMethod paypalPayment = new PayPalPayment("user@example.com");

        // OnlineStore using credit card
        OnlineStore store1 = new OnlineStore(ccPayment);
        store1.checkout(150.0);

        // OnlineStore using PayPal
        OnlineStore store2 = new OnlineStore(paypalPayment);
        store2.checkout(75.5);
    }
}