package ua.edu.ucu.apps.lab7.flowers;

public class Payment implements CreditCardPaymentStrategy {
    public static double pay(double price, CreditCardPaymentStrategy strategy) {
        return strategy.pay(price);
    }

    public static double pay(double price, PayPalPaymentStrategy strategy) {
        return strategy.pay(price);
    }

    @Override
    public double pay(double price) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pay'");
    }
}









