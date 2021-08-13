package ch02;

public class BirthDayTest {

    public static void main(String[] args) {
        
        BirthDay date = new BirthDay();

        date.setYear(2019);
        date.setMonth(12);
        date.setDay(31);

        //private가 아닐 경우
        //date.month=100 이렇게 직접 넣을수 있게 된다. 
        //오용이 되면 안되는 것들 위주로 private 변수를 사용 하면 된다.
        date.showDate();
    }
    
}
