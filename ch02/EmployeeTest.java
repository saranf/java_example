package ch02;

public class EmployeeTest {

    public static void main(String[] args) {
        
        Employee employee = new Employee();

        employee.setEmployeeName("이순신");

        System.out.println(employee.serialNum);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        employeeKim.serialNum++;

        System.out.println(employeeKim.getEmployeeName()+ employeeKim.getEmployeeId());        
        System.out.println(employee.getEmployeeName()+  employee.getEmployeeId());
    }
    
}
