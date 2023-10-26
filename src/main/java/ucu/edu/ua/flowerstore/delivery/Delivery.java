package ucu.edu.ua.flowerstore.delivery;
import ucu.edu.ua.flowerstore.flowers.Item;
import java.util.List;

public interface Delivery {
    public String deliver(List<Item> items);
}
