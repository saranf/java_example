package ch02;

public class Employee {

    public static int serialNum=1000;

    private int employeeId; 
    private String employeeName;
    private String department;

    //객체가 생성될때 초기화 작업은 생성자에서 해야 한다.

    public static int getSerialNum() {
        int i = 0;  //지역변수라서 x

       //employName = "Lee"; // 인스턴스가 생성되지 않은 상태에서 인스턴스 변수를 사용할 수 없다.

       
        return serialNum;
    }//중효한 변수이기 때문에 읽기만 해야 해서 getter만 사용 가능한다.

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
