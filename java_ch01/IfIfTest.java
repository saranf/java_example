public class IfIfTest {

    public static void main(String[] args) {
        int age=12 ; 
        int charge ;

        if(age<8){
            charge = 1000;
            System.out.println("미 취학 아동 입니다.");
        }
        if(age<14){
            charge = 2000;
            System.out.println("초등학생 입니다.");
        }
        if(age<20){
            charge = 2500;
            System.out.println("중 고등학생 입니다.");
        }
        else{
            charge=3000;//default조건 1개 이상은 꼭 필요
        }
        
        System.out.println("입장료는 = "+ charge + " 입니다.");
    }
    //하나의 상황에 대해 여러개를 분리 한다 if else 
    //각각의 상황에 따로따로 분리를 한다 if if 
    
}
