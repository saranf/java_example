package ch01;

public class Bus {

    int busNumber;
    int passngerCount;
    int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }
    public void take (int money){
        this.money += money;
        passngerCount ++;
    }

    public void showBusinfo(){
        System.out.println(busNumber+"번의 승객 수는 "+passngerCount+ "명이고 , 수입은"+money+"원 입니다.");
    }
    
}
