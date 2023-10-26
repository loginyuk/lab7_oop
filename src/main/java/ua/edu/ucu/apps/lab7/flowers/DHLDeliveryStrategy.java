package ua.edu.ucu.apps.lab7.flowers;

public interface DHLDeliveryStrategy {
    default double deliver(double price) {
        return price + 60.0;
    }
}
