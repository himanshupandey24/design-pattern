package org.example.structural.adaptor.razorpay;

public class RazorpayGateway {

    public String payByCreditCard(String creditcard, String cvv, String expiry){
        System.out.println("Payment Done by Razorpay");
        return "razorpay";
    }

    public boolean checkPaymentStatus(String id){
        return false;
    }
}
