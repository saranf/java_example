package ch01;
import java.util.Scanner;

public class DowhileTest {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int input;
        int sum=0; 

        input= scanner.nextInt();

        do{
            sum += input;
            input=scanner.nextInt();
        }
        while (input!=0);
        System.out.println(sum);
    }
    
    
}
