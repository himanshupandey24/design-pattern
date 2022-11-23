package org.example.structural.adaptor;

public class Flipkart {

    private PaymentGateway paymentGateway;

    public Flipkart(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void makePaymentViaCC(String cardNumber,
                                 int cvv,
                                 int expiryMonth,
                                 int expiryYear){
        Long transactionId = paymentGateway.payViaCC(
                cardNumber,
                cvv,
                expiryMonth,
                expiryYear
        );

        while(!paymentGateway.getStatus(transactionId).equals(PaymentStatus.SUCCESS)){
            System.out.println("waiting");
        }
    }
}
