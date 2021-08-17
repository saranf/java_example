package ch02;

public class StudentSubjectTest {

    public static void main(String[] args) {
        
        Student4 studentLee = new Student4(1001,"Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        Student4 studentKim = new Student4(1001,"Lee");
        studentKim.addSubject("국어", 100);
        studentKim.addSubject("수학", 50);
        studentKim.addSubject("영어", 75);

        studentKim.showScoreInfo();
        System.out.println("=============");
        studentLee.showScoreInfo();
    }
    
}
