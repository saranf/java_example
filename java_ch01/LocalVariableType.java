public class LocalVariableType {

    public static void main(String[] args) {
        var i = 10;  //int 
        var j = 10.0;  //double 
        var str = "hello";  //string 

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        //기존 컴파일 언어의 경우 자료형을 무조건 적어 주어야 했는데, 데이터가 명확한 경우 자료형이 없어도 가능하다.

        //str =3 ; 자바에서는 처음에 string목적으로 사용하면 무조건 끝까지 string 목적으로 사용 해야 한다.
        //이 기능은 java 10 부터 지원 된다
    }
    
}
