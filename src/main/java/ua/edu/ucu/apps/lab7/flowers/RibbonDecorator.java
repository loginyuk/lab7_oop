package ua.edu.ucu.apps.lab7.flowers;

public abstract class RibbonDecorator extends ItemDecorator{
    public Item item; 

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    public String getDescription() {
        description = "It is Ribbon";
        item.description = description;
        return item.getDescription();
    }

    public double getPrice() {
        return 40 + item.price();
    }
}
