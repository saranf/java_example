package ch02;

public class Car {

    private static int carNumber=10000;
    private int carNum;

    public Car(){
        carNumber++;
        carNum = carNumber;
    }

    public int getCarNum() {
        return carNum;
    }

    
}
