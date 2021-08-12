package ch02;

public class SubjectTest {

    public static void main(String[] args) {
        
        Studentgrade studentgrade = new Studentgrade(100, "Lee");
        studentgrade.setKoreaSubject("국어", 100);
        studentgrade.setMathSubject("수학", 90);

        studentgrade.showScoreInfo();
    }
    
}
