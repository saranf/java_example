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

        System.out.println(studentLee);//메모리 주소값 출력 참조값이라고도 한다.
        //studentLee가 자리잡은 heep 메모리의 주소값

        /*
        객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스

        클래스 : 객체를 프로그래밍 하기 위해 코드로 정의해 놓은 상태 

        인스턴스 : new 키워드를 사용하여 클래스를 메모리에 생성한 상테

        멤버 변수 : 클래스의 속성 , 특성 

        참조변수 : 메모리에 생성된 인스턴스를 가르키는 변수 

        참조값 : 생성된 메모리의 참조값 
        */




    }
    
}
