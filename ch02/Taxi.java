package ch02;

public class Taxi {

    int money;
    String texiName;


    public Taxi(String texiName) {
        this.texiName = texiName;
    }

    public void take(int money){
        this.money += money;
        System.out.println(this.money);
    }
    
    public void texiShow(){
        System.out.println(texiName+"의 수입은 "+money+" 원 입니다.");
    }
    
}
