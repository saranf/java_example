package ch02;

import java.util.ArrayList;

public class Student4 {

    int studentId;
    String studentName;

    ArrayList<Subject2> subjectList;
    

    Student4(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        

        subjectList = new ArrayList<Subject2>();
        

    }

    public void addSubject(String name, int point){
        
        Subject2 subject = new Subject2();
        subject.setName(name);
        subject.setScorePoint(point);
        subjectList.add(subject);
    }
   
    public void showScoreInfo(){
        
        int total=0;
        for(Subject2 subject : subjectList){
            
            total =+ subject.getScorePoint();
            System.out.println(studentName +"학생의 "+ subject.getName()+ "과목의 성적은 "+ subject.getScorePoint());
            
        }
        System.out.println(total);
        
    }
    
}
