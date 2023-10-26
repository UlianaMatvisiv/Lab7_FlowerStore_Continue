package ucu.edu.ua.flowerstore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucu.edu.ua.flowerstore.payment.PayPalPaymentStrategy;
import ucu.edu.ua.flowerstore.payment.CreditCardPaymentStrategy;
public class PaymentTest {
    private CreditCardPaymentStrategy creditCard;
    private PayPalPaymentStrategy payPal;

    @BeforeEach
    public void init() {
        creditCard = new CreditCardPaymentStrategy();
        payPal = new PayPalPaymentStrategy();
    }

    @Test
    public void testPaymentStrategies() {
        double price1 = 578.7;
        double price2 = 221.33;
        Assertions.assertEquals(price1, creditCard.pay(price1));
        Assertions.assertEquals(price2, payPal.pay(price2));
    }
}
