package ch01;
public class OperatorTest {
    public static void main(String[] args) {
        int gameScore = 150;

        int lastScore = ++gameScore; //gamescort +=1; 

        System.out.println(lastScore);
        System.out.println(gameScore);
    }
}