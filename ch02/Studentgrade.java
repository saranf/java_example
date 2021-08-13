package ch02;

public class Studentgrade {

    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    Studentgrade(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score){
        korea.score = score;
        korea.subjectName = name;
    }

    public void setMathSubject(String name, int score){
        math.score = score;
        math.subjectName = name;
    }

    public void showScoreInfo(){
        int total = korea.score + math.score;
        System.out.println(studentName +"학생의 총점은 "+total+"입니다.");
    }
}
