package ch02;

public class Employee {

    public static int serialNum=1000;

    private int employeeId; 
    private String employeeName;
    private String department;

    //객체가 생성될때 초기화 작업은 생성자에서 해야 한다.

    public Employee(){
        serialNum ++;
        employeeId = serialNum; //기준값
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    
}
