class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String duration;
    Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new Manager("Ravi", 101, 50000, 5);
        Employee e2 = new Developer("Neha", 102, 40000, "Java");
        Employee e3 = new Intern("Ajay", 103, 15000, "3 months");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
