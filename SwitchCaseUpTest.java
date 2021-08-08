public class SwitchCaseUpTest {

    public static void main(String[] args) {
        
        int month= 3 ;

        int day = switch (month){
            case 1,3,5,7,8,10,12 ->{
                System.out.println("한 달은 31일 입니다.");
                yield 31;
            }
            case 2 ->{
                yield 28;
            }
            case 4,6,9,11  -> {
                System.out.println("한 달은 30일 입니다.");
                yield 30;
            }
            default ->{
                System.out.println("존재하지 않는 달 입니다.");
                yield -1;
            }
        };
        System.out.println(month+"달은"+day+"일 입니다.");
    }
    
}
