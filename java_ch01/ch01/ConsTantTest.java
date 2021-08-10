package ch01;
public class ConsTantTest {

    public static void main(String[] args) {
        //상수는 변하지 않는 수 
        //final을 사용하여 선언 

        final int MAX_NUM = 100;// 대문자로 상수를 많이 쓰기도 한다
        final int MIN_NUM ; 

        MIN_NUM = 10;  // 초기화 안하고 쓸수 없다.

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

    }
    
}
