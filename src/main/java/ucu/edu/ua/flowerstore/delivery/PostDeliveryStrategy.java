package ucu.edu.ua.flowerstore.delivery;

import java.util.List;

import ucu.edu.ua.flowerstore.flowers.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivering items via Post";
    }
}

