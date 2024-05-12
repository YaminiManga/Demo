package Observer;

public class App {
    public static void main(String[] args) {
        Flipkart instance=Flipkart.getInstace();
        EmailSender emailSender = new EmailSender();
        WareHouseManagement wareHouseManagement=new WareHouseManagement();
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        instance.orderPalced();

    }
}
