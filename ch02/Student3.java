package ch02;

public class Student3 {

    public int studentNumber;
    public String studentName;
    public int grade;

    public Student3(){}; // default  생성자 

    public  Student3( int studentNumber , String studentName, int grade){
        //studentNumber = studentNumber; //변수를 찾는것은 가장 가까운곳에서 변수를 찾는다. 그래서 결국 () 안에다가 넣는다.
        this.studentNumber = studentNumber; //멤버 변수의 studentNumber 를 가르키고 있는 것이다. 
        this.studentName = studentName;
        this.grade = grade;
        System.out.println("student 생성");
    }//생성자를 직접 만든것 

    //똑같은 생성자가 여러개 있는 것이 컨스트럭트 오버로딩인 것이다.

    public String showStudentInfo(){

        return studentNumber + "학생의 학번은 " + studentNumber + "이고 , " + grade + "학년 입니다. ";
    }
    
}
