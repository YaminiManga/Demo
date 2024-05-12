package Singleton;

public class App {
    public static void main(String[] args) {
        DataBaseConnectivityV1 dbv1Object1=new DataBaseConnectivityV1();
        dbv1Object1.setUserName("Yamini");
        dbv1Object1.setPassword("YAMINIPASSWORD");
        dbv1Object1.setPort(1);
        System.out.println("dbv1Object1 UserName "+dbv1Object1.getUserName()+" Password "+dbv1Object1.getPassword()
        +" PORT "+dbv1Object1.getPort());
        DataBaseConnectivityV1 dbv1Object2=new DataBaseConnectivityV1();
        dbv1Object2.setUserName("Yamini2");
        dbv1Object2.setPassword("YAMINIPASSWORD2");
        dbv1Object2.setPort(1);
        System.out.println("dbv1Object1 UserName "+dbv1Object2.getUserName()+" Password "+dbv1Object2.getPassword()
                +" PORT "+dbv1Object2.getPort());



    }
}
