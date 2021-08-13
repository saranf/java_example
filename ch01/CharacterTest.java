package ch01;
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

        //character set : 문자를 숫자로 변환한 값의 셋트
        //encodeing : 문자 -> 숫자로 변환되는것 
        //decoding : 숫자 -> 문자로 변환하는것 
        //Ascii code : 알파벨과 숫자 특수문자들을 1바이트에 표현하는데 사용하는 문자세트
        //UNICODE : 전 세계 표준으로 만든 문자 세트 
        //UTF-8 : 1바이트에서 4바이트까지 다양하게 문자를 표현할수 있음 
        //UTF-16 : 2 바이트의 문자로 표현 

    }
    
}
