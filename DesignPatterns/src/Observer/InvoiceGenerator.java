package Observer;

public class InvoiceGenerator implements OrderPlacedSubscriber{
    public InvoiceGenerator() {
        Flipkart.getInstace().registerSubscriber(this);
    }

    @Override
    public void announceOrderPlacement() {
        System.out.println("Generating invoice");
    }
}
