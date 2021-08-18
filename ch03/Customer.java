package ch03;

public class Customer {//if else가 많을시 상속을 생각해 보자

    protected int custmorID; //하위클래스에서는 접근 가능하지만 외부에서는 접근 가능하다.
    protected String custmorName;
    protected String custmorGrade;
    int bonusPoint;
    double bonousRatio;

    public String getCustmorGrade() {
        return custmorGrade;
    }
    public void setCustmorGrade(String custmorGrade) {
        this.custmorGrade = custmorGrade;
    }
    public int getCustmorID() {
        return custmorID;
    }
    public void setCustmorID(int custmorID) {
        this.custmorID = custmorID;
    }
    public String getCustmorName() {
        return custmorName;
    }
    public void setCustmorName(String custmorName) {
        this.custmorName = custmorName;
    }

    /*public Customer(){
        bonousRatio = 0.01; // 일반 적립비율
        custmorGrade = "SILVER"; //고객 등급

        System.out.println("Customer() call");//testcode
    }*/
    public Customer(int customerID, String customerName){
        this.custmorID = customerID;
        this.custmorName = customerName;

        bonousRatio = 0.01; // 일반 적립비율
        custmorGrade = "SILVER"; //고객 등급
    }

    public int clacPrice(int price){ //물건을 삿을때 
        bonusPoint += price * bonousRatio; //보너스 포인트만 적립해 준다.
        return price; //할인율을 위하여
    }

    public void showCustomerInfo(){
        System.out.println(custmorName +"님의 등급은"+ custmorGrade + "이며, 보너스 포인트는 "+bonusPoint + "입니다.");
    }

    

    
}
