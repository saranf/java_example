public class VariableTest2 {
    public static void main(String[] args) {
        byte bnum = -128 ;
        System.out.println(bnum);

        //int num =12345678900;  4byte에는 해당 수를 들일수 없다.
        long num =12345678900L;  //8byte에는 해당 수를 들일수 있다.
        System.out.println(num);
    }
}
