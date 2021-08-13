package ch02;

public class Person2 {

    String personName;
    int money;

    
    public Person2(String personName, int money){
        this.personName = personName;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        this.money -= 1000;
    }
    public void showPerson(){
        System.out.println(personName+ "님의 남은 돈은"+ money+ "원 입니다.");
    }
}
