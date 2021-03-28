package AbstractFactory;

public interface EFactory {
    //抽象类工厂
    public Television produceTelevision();
    public AirConditioner produceAirConditioner();
    //定义两个抽象类方法，针对每一个产品簇的产品都提供了一个对应的工厂方法。
}
