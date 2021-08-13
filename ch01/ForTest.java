package ch01;
public class ForTest {
    public static void main(String[] args) {
        
        int count =1 ;
        int sum =0;

        for(int i=0; i<10; i++,count++){//10번증가
            sum += count;
        }
        System.out.println(count);
    }    
}
