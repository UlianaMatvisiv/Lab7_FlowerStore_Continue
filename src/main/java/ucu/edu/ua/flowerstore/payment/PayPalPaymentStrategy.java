package ucu.edu.ua.flowerstore.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public double pay(double price) {
        return price;
    }
}