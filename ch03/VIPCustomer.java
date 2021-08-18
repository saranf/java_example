package ch03;

public class VIPCustomer extends Customer {

    double salesRatio;
   private String agentID;

  
   public String getAgentID() {
       return agentID;
   }
   public void setAgentID(String agentID) {
       this.agentID = agentID;
   }

   /*VIPCustomer(){
       //super(); ==> 상위 클래스의 생성자를 호출한다.
       //하위 클래스가 상위 클래스위 참조값을 참조할 수 있다.
       //아무것도 안 들어가있때는 default 생성자를 호출할수 있다.
       bonousRatio = 0.05;
       salesRatio = 0.1;
       custmorGrade = "VIP";
       System.out.println("VIPCustomer Call");
   }*/
   public VIPCustomer(int customerID, String customerName){
       super(customerID, customerName);
       bonousRatio = 0.05; // 적립비율
       custmorGrade = "VIP"; //고객 등급
   }
    
}
