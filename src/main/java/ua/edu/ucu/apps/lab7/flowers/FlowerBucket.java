package ua.edu.ucu.apps.lab7.flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item{
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowers(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price  = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public double price() {
        return getPrice();
    }

    public FlowerPack searchFlower(FlowerType flowerType) {
        for (FlowerPack flowerPack: flowerPacks) {
            if (flowerPack.getFlower().getFlowerType() == flowerType) {
                return flowerPack;
            }
        }
        return null;
    }


}
