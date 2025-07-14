package Interface.problem2;

public class PayPal implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}
