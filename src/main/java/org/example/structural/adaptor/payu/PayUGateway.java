package org.example.structural.adaptor.payu;

public class PayUGateway {
    public String makeCCPayment(Long creditCard,
                                Long cvv,
                                Long expiry){
        System.out.println("Payment done by PayUGateway");
        return "payU";
    }

    public PayUPaymentStatus checkPaymentStatus(String id){
        return PayUPaymentStatus.FAILURE;
    }
}
