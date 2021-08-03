public class CharacterTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1); //데이터 형을 int형으로 강제로 변환함 char -> int 

        char ch2 = 66;
        System.out.println(ch2);
        System.out.println((char)ch2);// 데이터 형을 char로 강제로 변환함  char -> char 

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3); //int -> char형으로 변환 


        //char ch = 123456; 2byte안에서 핸들링 할수 없는거는 오류난다.
        char ch='\uD55C';
        System.out.println(ch);

    }
    
}
