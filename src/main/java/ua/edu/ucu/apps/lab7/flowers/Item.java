package ua.edu.ucu.apps.lab7.flowers;

public abstract class Item {
    public String description = "Unknown Item";
    public abstract double price();
    public String getDescription() {
        return description;
    }
}