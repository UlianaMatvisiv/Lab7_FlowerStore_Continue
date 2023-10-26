package ucu.edu.ua.flowerstore.order;

import java.util.LinkedList;

import lombok.ToString;
import ucu.edu.ua.flowerstore.delivery.Delivery;
import ucu.edu.ua.flowerstore.flowers.Item;
import ucu.edu.ua.flowerstore.payment.Payment;

@ToString
public class Order {
    private LinkedList<Item> items = new LinkedList<>();
    private Payment paymentStrategy;
    private Delivery deliveryStrategy;

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void setDeliveryStrategy(Delivery deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }
    public void calculateTotalPrice() {
        double totalPrice = items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
        System.out.println("Total price: $" + totalPrice);
    }

    public void processOrder() {
        System.out.println("Processing the order");
        paymentStrategy.pay(getTotalPrice());
        deliveryStrategy.deliver(items);
    }
    
    public double getTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
