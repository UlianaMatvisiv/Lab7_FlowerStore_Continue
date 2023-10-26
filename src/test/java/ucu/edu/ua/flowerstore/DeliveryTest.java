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
    private static final double FIRST_FLOWER_PRICE = 45;
    private static final double SECOND_FLOWER_PRICE = 50;
    private static final double FIRST_SEPAL_LENGTH = 0.8;
    private static final double SECOND_SEPAL_LENGTH = 0.9;

    @Test
    public void testPostDelivery() {
        PostDeliveryStrategy postDeliveryStrategy = new PostDeliveryStrategy();
        List<Item> itemsToDeliver = new LinkedList<>();

        itemsToDeliver.add(new Flower(FIRST_SEPAL_LENGTH,
            FlowerColor.RED, FIRST_FLOWER_PRICE, FlowerType.ROSE));
        itemsToDeliver.add(new Flower(SECOND_SEPAL_LENGTH,
            FlowerColor.BLUE, FIRST_FLOWER_PRICE, FlowerType.TULIP));
        String deliveryResult = postDeliveryStrategy.deliver(itemsToDeliver);

        Assertions.assertEquals("Delivering items via Post", deliveryResult);
    }

    @Test
    public void testDHLDelivery() {
        DHLDeliveryStrategy dhlDeliveryStrategy = new DHLDeliveryStrategy();
        List<Item> itemsToDeliver = new LinkedList<>();

        itemsToDeliver.add(new Flower(FIRST_SEPAL_LENGTH,
            FlowerColor.RED, FIRST_FLOWER_PRICE, FlowerType.TULIP));
        itemsToDeliver.add(new Flower(SECOND_SEPAL_LENGTH,
            FlowerColor.GREEN, SECOND_FLOWER_PRICE, FlowerType.CHAMOMILE));
        String deliveryResult = dhlDeliveryStrategy.deliver(itemsToDeliver);

        Assertions.assertEquals("Delivering items via DHL", deliveryResult);
    }
}
