package ch01;


public class TakeTransTest {

    public static void main(String[] args) {
        
        Student2 studentJ = new Student2("James", 5000);
        Student2 studentT = new Student2("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        studentJ.takeBus(bus100);

        Subway greenSubway = new Subway(2);
        studentT.takeSubway(greenSubway);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusinfo();
        greenSubway.showSubwayInfo();

        bus500.showBusinfo();
    }
    
}
