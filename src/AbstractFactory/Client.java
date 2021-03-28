package AbstractFactory;

public class Client {
    public static void main(String args[])
    {
        try
        {
            EFactory factory;
            Television tv;
            AirConditioner ac;
            factory = XMLUTil.getBrandName();
            tv = factory.produceTelevision();
            tv.play();
            ac = factory.produceAirConditioner();
            ac.changeTempreture();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
