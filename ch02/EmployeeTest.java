package ch02;

public class EmployeeTest {

    public static void main(String[] args) {
        
        Employee employee = new Employee();

        employee.setEmployeeName("이순신");

        System.out.println(employee.serialNum);//class 변수로 인스턴스의 생성과는 상관없이 사용할수 있다.
        //이미 메모리에 올라가 있기 때문이다. 
        //클래스 이름으로 참조해서 쓰라고 해서 노란줄로 쳐져 있다.

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        employeeKim.serialNum++;

        System.out.println(employeeKim.getEmployeeName()+ employeeKim.getEmployeeId());        
        System.out.println(employee.getEmployeeName()+  employee.getEmployeeId());
    }
    
}
