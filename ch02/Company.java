package ch02;

public class Company {

    private static Company intance = new Company();//외부에서 가져다 쓸수 없어서 private

    private Company(){//외부에서 가져다 쓸수 없어서 private 

    }

    public static Company getInstance(){ //외부에서 클래스 이름으로 이 메소드 이름을 호출해서 사용할수 있다.
        if(intance == null){
            intance = new Company();
        }

        return intance;
    }


    
}
