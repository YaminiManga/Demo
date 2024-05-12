package Observer;

public class WareHouseManagement implements OrderPlacedSubscriber{
    public WareHouseManagement() {
        Flipkart.getInstace().registerSubscriber(this);
    }

    @Override
    public void announceOrderPlacement() {
        System.out.println("Warehouse data updating");
    }
}
