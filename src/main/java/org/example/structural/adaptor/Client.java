package org.example.structural.adaptor;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new RazorpayPaymentGatewayAdaptor());
    }
}
