package ch02;

import java.util.Calendar;

public class CompanyTest {

    public static void main(String[] args) {
        
        Company company = Company.getInstance();
        Company company2 = Company.getInstance();
        //외부에서 생성할 수 없고 내부에 instance 하나만 제공되고 있고 그것만 사용할수 있다.

        System.out.println(company);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();//싱글톤 패턴과 동일하다.
    }
    
}
