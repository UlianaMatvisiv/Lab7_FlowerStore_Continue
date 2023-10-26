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
        itemsToDeliver.add(new Flower(0.8, FlowerColor.RED, 45, FlowerType.ROSE));
        itemsToDeliver.add(new Flower(0.9, FlowerColor.GREEN, 50, FlowerType.CHAMOMILE));
        itemsToDeliver.add(new Flower(1.2, FlowerColor.BLUE, 45, FlowerType.TULIP));
        String deliveryResult = postDeliveryStrategy.deliver(itemsToDeliver);

        Assertions.assertEquals("Delivering items via Post", deliveryResult);
    }
    @Test
    public void testDHLDelivery() {
        DHLDeliveryStrategy dhlDeliveryStrategy = new DHLDeliveryStrategy();
        List<Item> itemsToDeliver = new LinkedList<>();
        itemsToDeliver.add(new Flower(0.8, FlowerColor.RED, 45, FlowerType.ROSE));
        itemsToDeliver.add(new Flower(0.9, FlowerColor.GREEN, 50, FlowerType.CHAMOMILE));
        itemsToDeliver.add(new Flower(1.2, FlowerColor.BLUE, 45, FlowerType.TULIP));
        String deliveryResult = dhlDeliveryStrategy.deliver(itemsToDeliver);

        Assertions.assertEquals("Delivering items via DHL", deliveryResult);
    }
}
