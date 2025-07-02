class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    char grade;

    Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void showDetails(Object obj) {
        if (obj instanceof Student) {
            System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade + ", University: " + universityName);
        }
    }
}
