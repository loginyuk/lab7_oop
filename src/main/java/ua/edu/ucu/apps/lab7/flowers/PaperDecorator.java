package ua.edu.ucu.apps.lab7.flowers;

public abstract class PaperDecorator extends ItemDecorator{
    public Item item; 

    public PaperDecorator(Item item) {
        this.item = item;
    }

    public String getDescription() {
        description = "It is Paper";
        item.description = description;
        return item.getDescription();
    }

    public double getPrice() {
        return 13 + item.price();
    }
}
