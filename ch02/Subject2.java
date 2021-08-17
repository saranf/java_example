package ch02;

public class Subject2 {

    private String name;
    private int scorePoint;

    public String getName() {
        System.out.println("getname");
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScorePoint() {
        System.out.println("point");
        return scorePoint;
    }
    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
    
}
