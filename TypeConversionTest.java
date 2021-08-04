public class TypeConversionTest {

    public static void main(String[] args) {
        byte bnum = 125; 
        int iNum = bnum;  //byte -> int로 자동 형 변환이 이루어 진다.

        //int iNum2 = 255;
        //byte bnum2 = iNum2; int 가 byte보다 훨씬 크므로 자오 형 변환이 안된다.

        System.out.println(iNum );

        double dNum = 3.14;
        int inum3 = (int)dNum ; // 소숫점 -> 정수 이렇게는 자동 형면환이 안되므로 문제가 된다.

        System.out.println(inum3);

        double dnum=1.2;
        float fnum = 0.9F;
        
        int inum4 = (int)dNum + (int)fnum ;
        int inum5 = (int)(dNum + fnum);
        System.out.println(inum4);
        System.out.println(inum5);
    }
    
}
