package ucu.edu.ua.flowerstore.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price;
    }
}
