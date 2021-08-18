package ch03;

public class CustomerTest {

    public static void main(String[] args) {
        
        Customer customerLee = new Customer(10010,"이순신");

        //customerLee.setCustmorName("이순신");
        //customerLee.setCustmorID(10010);
        customerLee.bonusPoint=1000;
        
        customerLee.showCustomerInfo();

        VIPCustomer customerKim = new VIPCustomer(10020,"김유신");//vip가 일반 customer을 쓸수 있는 이유는 사전에 상속을 받아서 이미 메모리에 만들어 져 있기 때문이다.

        //customerKim.setCustmorName("김유신");
        //customerKim.setCustmorID(10020);
        customerKim.bonusPoint=10000;
        customerKim.showCustomerInfo();

        Customer vc = new VIPCustomer(12345, "김유신");
        //vc.//customer로 바인딩이 되어있기 때문에 customer것만 쓸수 있다.
        /*
        vip생성자에 의해 vipcustomer클래스의 모든 멤버 변수에 대한 메모리는 생성되었지만, 변수의 타입이 Customer이므로 실제 접근 가능한 변수는 전부 customer이다.
        */

    
    }
}
    
