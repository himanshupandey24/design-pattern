package org.example.behavioural.obersver;

public class InvoiceManagementService implements Subscriber<Order>{

    @Override
    public void listen(Events events, Order order) {
        if (events == Events.ORDER_PLACED) {
            generateInvoice(order);
        } else {
            cancelInvoice(order);
        }
    }

    public void generateInvoice(Order order) {
        System.out.println("Generating invoice for order");
    }

    public void cancelInvoice(Order order) {
        System.out.println("Cancelling Invoice");
    }
}
