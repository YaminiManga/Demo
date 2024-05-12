package Observer;

public class EmailSender implements OrderPlacedSubscriber{
    public EmailSender() {
        Flipkart.getInstace().registerSubscriber(this);
    }

    @Override
    public void announceOrderPlacement() {
        System.out.println("Sending Email");
    }
}
