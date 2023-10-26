package ucu.edu.ua.flowerstore.payment;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")
public class PaymentController {
    
    @GetMapping("/payment")
    public String getDeliveryStrategies() {
        return "Ways of payment " + List.of(
            PayPalPaymentStrategy.class,
            CreditCardPaymentStrategy.class);
    }

}
