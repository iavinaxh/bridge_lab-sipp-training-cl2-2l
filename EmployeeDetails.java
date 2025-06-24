import java.util.Scanner;

class Emp {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp emp = new Emp();

        System.out.print("Enter Employee Name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        emp.id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        emp.salary = sc.nextDouble();

        System.out.println("\n--- Employee Details ---");
        emp.displayDetails();
    }
}
