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

    
    }
}
    
