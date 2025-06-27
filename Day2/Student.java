class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    void displayName() {
        System.out.println("Name (from protected): " + name);
    }
}
