import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String name;
    ArrayList<Employee> employees;

    Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            e.show();
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments;

    Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void addEmployeeToDepartment(String deptName, String empName) {
        for (Department d : departments) {
            if (d.name.equals(deptName)) {
                d.addEmployee(empName);
            }
        }
    }

    void showStructure() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showEmployees();
        }
    }
}

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company("TechNova");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.addEmployeeToDepartment("IT", "Avinash");
        company.addEmployeeToDepartment("IT", "Riya");
        company.addEmployeeToDepartment("HR", "Neha");

        company.showStructure();
    }
}
