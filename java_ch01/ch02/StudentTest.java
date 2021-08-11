package ch02;

public class StudentTest {

    public static void main(String[] args) {
        
        Student2 studentLee = new Student2(); //이것이 데이터 타입이다.
        //클래스를 기반으로 여러개의 인스턴스를 생성 할 수 있다. 
        //이것은 참조 변수라고도 한다

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address="서울 강남구";

        studentLee.showStudentIndo();




    }
    
}
