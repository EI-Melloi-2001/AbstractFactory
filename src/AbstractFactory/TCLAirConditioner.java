package AbstractFactory;

public class TCLAirConditioner implements AirConditioner{
    @Override
    public void changeTempreture() {
        System.out.println("TCL空调温度改变中...");
    }
}
