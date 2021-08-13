package ch02;

public class UserInfo3 {

    public int orderNumber;
    public int orerPhoneNumber;
    public String homeAddress;
    public int orderDate;
    public int orderPrice;
    public int orderTime;
    public int orderCount;

    public UserInfo3(){};

    public UserInfo3(int orderNumber, int orderPhoneNumber, String homeAddress, int orderDate, int orderTime,int orderPrice, int orderCount){
        this.orderNumber = orderNumber;
        this.orerPhoneNumber = orderPhoneNumber;
        this.homeAddress = homeAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.orderCount = orderCount;
    }

    public String showOrder(){
        return "주문 번호 : "+orderNumber +"\n" +"주문 핸드폰 번호 : "+orerPhoneNumber+"\n"+"주문 집주소 : "+homeAddress+"\n"+"주문 날짜 : "+orderDate+"\n"+"주문 시간 : "+orderTime+"\n"+"주문 가격 : "+orderPrice+"\n"+"주문 번호 : "+orderCount;
    }

    
}
