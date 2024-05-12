package Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart flipkart;
    List<OrderPlacedSubscriber> orderPlacedSubscriberList=new ArrayList<>();

    private Flipkart() {
    }

    public static Flipkart getInstace()
    {
        if(flipkart==null)
            flipkart= new Flipkart();
        return flipkart;
    }
    public void registerSubscriber(OrderPlacedSubscriber subscriber)
    {
        orderPlacedSubscriberList.add(subscriber);
    }
    public void unRegisterSubscriber(OrderPlacedSubscriber subscriber)
    {
        orderPlacedSubscriberList.remove(subscriber);
    }
    public void orderPalced()
    {
        //notify all the subscribers
        for(OrderPlacedSubscriber subscriber:orderPlacedSubscriberList)
        {
            subscriber.announceOrderPlacement();
        }
    }
}
