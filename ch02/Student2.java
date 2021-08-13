package ch02;

public class Student2 {

    public int studentID;
    public String studentName;
    public String address; 

    public void showStudentIndo(){
        System.out.println(studentID+ "학번의 이름은 "+ studentName + "이고, 주소는  " + address +"입니다.");
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }
    
}
