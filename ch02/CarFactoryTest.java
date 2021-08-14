package ch02;

public class CarFactoryTest {

    public static void main(String[] args) {
        
        CarFactory factory = CarFactory.getinstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println("sonata = "+mySonata.getCarNum());
        System.out.println("your = "+yourSonata.getCarNum());
        //static 변수는 업데이트가 되기 때문에 기준값이 필요하다.
    }
    
}
