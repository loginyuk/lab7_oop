package ua.edu.ucu.apps.lab7.delivery;

public interface PostDeliveryStrategy {
    public default double deliver(double price) {
        return price + 30.0;
    }
}
