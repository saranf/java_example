package ch01;

public class Student2 {

    String sudentName;
    int money;

    public Student2(String studentName, int money){
        this.sudentName = studentName;
        this.money= money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -=1000;
    }

    public void showInfo(){
        System.out.println(sudentName + "님의 남은 돈은 "+ money + "원 입니다.");
    }



    
}
