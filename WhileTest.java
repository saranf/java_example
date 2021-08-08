public class WhileTest {

    public static void main(String[] args) {
        
        int num = 1;
        int sum = 0;

        while(num <=10){
            sum += num; //지역변수는 초기화를 반드시 해 주어야 한다.
            num ++;
        }
        System.out.println(sum);
        System.out.println(num);
    }
    
}
