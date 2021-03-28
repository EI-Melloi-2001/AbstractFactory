package AbstractFactory;

public class HaierConditioner implements AirConditioner{
    @Override
    public void changeTempreture() {
        System.out.println("海尔空调温度改变中...");
    }
}
