class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;
    final int id;
    String name, designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void printDetails(Object obj) {
        if (obj instanceof Employee) {
            System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Company: " + companyName);
        }
    }
}
