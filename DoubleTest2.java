public class DoubleTest2 {
    
    public static void main(String[] args) {
        double dnum=1;

        for(int i=0; i<10000;i++){
            dnum= dnum+0.1;
        }
        System.out.println(dnum); //더미로 약간의 오류가 나타나는것을 볼수 있다.
        //부동소수점의 오류
    }
}