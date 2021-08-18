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

   VIPCustomer(){
       bonousRatio = 0.05;
       salesRatio = 0.1;
       custmorGrade = "VIP";
   }
    
}
