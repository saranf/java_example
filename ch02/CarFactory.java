package ch02;

public class CarFactory {

    private static CarFactory instance = new CarFactory();
   

    private CarFactory(){};

    public static CarFactory getinstance(){
        if (instance==null){
            CarFactory instance = new CarFactory();
        }
        return instance;        

    }

    public Car createCar() {
        Car car = new Car(); 
        //System.out.println("create = "+car.getCarNumber());
        return car; 
    }
    
}
