package ua.edu.ucu.apps.lab7.flowers;

public abstract class BasketDecorator extends ItemDecorator{
    public Item item; 

    public BasketDecorator(Item item) {
        this.item = item;
    }

    public String getDescription() {
        description = "It is Basket";
        item.description = description;
        return item.getDescription();
    }

    public double getPrice() {
        return 4 + item.price();
    }
}
