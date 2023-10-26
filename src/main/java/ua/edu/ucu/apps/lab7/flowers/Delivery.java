package ua.edu.ucu.apps.lab7.flowers;

public class Delivery {
    public static double pay(double price, DHLDeliveryStrategy strategy) {
        return strategy.deliver(price);
    }

    public static double pay(double price, PostDeliveryStrategy strategy) {
        return strategy.deliver(price);
    }

    public double deliver(double total) {
        return 0;
    }
}
