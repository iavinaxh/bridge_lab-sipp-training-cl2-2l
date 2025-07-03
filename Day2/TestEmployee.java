class TestEmployeeEmployee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends TestEmployeeEmployee {
    void showDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.employeeID = 1001;
        mgr.department = "Sales";
        mgr.setSalary(65000);

        mgr.showDetails();
        System.out.println("Salary: " + mgr.getSalary());
    }
}
