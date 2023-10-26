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
        Assertions.assertEquals(578.7,creditCard.pay(578.7));
        Assertions.assertEquals(221.33, payPal.pay(221.33));
    }
}
