package Interface.problem2;

public class UPI implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}