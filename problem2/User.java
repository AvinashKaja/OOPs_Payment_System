package Interface.problem2;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount:");
        double amount = sc.nextDouble();
        System.out.println("Enter the payment method:");
        int paymentMethod = sc.nextInt();
        switch(paymentMethod){
            case 1:
                CreditCard creditCard = new CreditCard();
                creditCard.pay(amount);
                break;
            case 2:
                PayPal paypal = new PayPal();
                paypal.pay(amount);
                break;
                case 3:
                    UPI upi = new UPI();
                    upi.pay(amount);
                        break;

        }


    }
}
