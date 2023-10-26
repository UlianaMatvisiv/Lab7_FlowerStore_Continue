package ucu.edu.ua.flowerstore.flowers;

import lombok.Getter;

@Getter 
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setQuantity(int flowerQuantity) {
        if (flowerQuantity < 1) {
            this.quantity = 1;
        }
        else {
            this.quantity = flowerQuantity;
        }
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

}