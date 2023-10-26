package ucu.edu.ua.flowerstore;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ucu.edu.ua.flowerstore.delivery.DHLDeliveryStrategy;
import ucu.edu.ua.flowerstore.delivery.PostDeliveryStrategy;
import ucu.edu.ua.flowerstore.flowers.Flower;
import ucu.edu.ua.flowerstore.flowers.FlowerColor;
import ucu.edu.ua.flowerstore.flowers.FlowerType;
import ucu.edu.ua.flowerstore.flowers.Item;

public class DeliveryTest {
    @Test
    public void testPostDelivery() {
        PostDeliveryStrategy postDeliveryStrategy = new PostDeliveryStrategy();
        List<Item> itemsToDeliver = new LinkedList<>();
        double price = 45;
        double secondprice = 50;
        double sepalLength = 0.8;
        double secondsepalLength = 0.9;
        itemsToDeliver.add(new Flower(sepalLength,
            FlowerColor.RED, price, FlowerType.ROSE));
        itemsToDeliver.add(new Flower(secondsepalLength,
            FlowerColor.GREEN, secondprice, FlowerType.CHAMOMILE));
        itemsToDeliver.add(new Flower(secondsepalLength,
            FlowerColor.BLUE, price, FlowerType.TULIP));
        String deliveryResult = postDeliveryStrategy.deliver(itemsToDeliver);

        Assertions.assertEquals("Delivering items via Post", deliveryResult);
    }
    @Test
    public void testDHLDelivery() {
        DHLDeliveryStrategy dhlDeliveryStrategy = new DHLDeliveryStrategy();
        List<Item> itemsToDeliver = new LinkedList<>();
        double price = 45;
        double secondprice = 50;
        double sepalLength = 0.8;
        double secondsepalLength = 0.9;
        itemsToDeliver.add(new Flower(sepalLength,
            FlowerColor.RED, price, FlowerType.ROSE));
        itemsToDeliver.add(new Flower(secondsepalLength,
            FlowerColor.GREEN, secondprice, FlowerType.CHAMOMILE));
        itemsToDeliver.add(new Flower(secondsepalLength,
            FlowerColor.BLUE, price, FlowerType.TULIP));
        String deliveryResult = dhlDeliveryStrategy.deliver(itemsToDeliver);

        Assertions.assertEquals("Delivering items via DHL", deliveryResult);
    }
}
