package ucu.edu.ua.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @AllArgsConstructor @ToString @NoArgsConstructor
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
        this.color = flower.color;
    }
    public String getColor() {
        return color.toString();
    }
}
