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

    // Define constants for the test prices
    private static final double FIRST_PRICE = 578.7;
    private static final double SECOND_PRICE = 221.33;

    @Test
    public void testPaymentStrategies() {
        // Use the constants in your test cases
        Assertions.assertEquals(FIRST_PRICE, creditCard.pay(FIRST_PRICE));
        Assertions.assertEquals(SECOND_PRICE, payPal.pay(SECOND_PRICE));
    }
}
