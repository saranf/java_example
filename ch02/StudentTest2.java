package ch02;

public class StudentTest2 {
//멤버변수와 지역변수는 아예 다른것 꼭 기억하기!
    public static void main(String[] args) {
        Student3 studentLee = new Student3();    

        Student3 studentKim = new Student3(123456, "kim", 3);//생성자에는 리턴값을 사용하지 않는다

        System.out.println(studentKim.showStudentInfo() );

       
    }

    
}
