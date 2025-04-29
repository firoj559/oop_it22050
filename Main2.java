class Employee {
    private String employeeName;  // private: accessible only within the class

    public void setEmployeeName(String newEmployeeName) {
        employeeName = newEmployeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeName("Firoj");
        System.out.println(emp.getEmployeeName());
    }
}
