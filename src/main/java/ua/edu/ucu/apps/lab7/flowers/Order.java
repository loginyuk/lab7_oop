package ua.edu.ucu.apps.lab7.flowers;

import java.util.LinkedList;

import org.springframework.boot.convert.Delimiter;

public class Order {
    LinkedList <Item> items = new LinkedList<Item>();
    Payment payment;
    Delivery delivery;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item: items) {
            total += item.price();
        }
        return total;
    }
    public void processOrder() {
        double total = calculateTotalPrice();
        total = Payment.pay(total, payment);
        total = delivery.deliver(total);
        System.out.println("Total price: " + total);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
