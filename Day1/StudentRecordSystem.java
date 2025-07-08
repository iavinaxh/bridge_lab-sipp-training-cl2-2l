import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int age;
    String grade;
    Student next;

    Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    Student head;

    void addAtBeginning(Student newStudent) {
        newStudent.next = head;
        head = newStudent;
    }

    void addAtEnd(Student newStudent) {
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newStudent;
    }

    void addAtPosition(Student newStudent, int position) {
        if (position == 0) {
            addAtBeginning(newStudent);
            return;
        }
        Student temp = head;
        for (int i = 1; i < position && temp != null; i++) temp = temp.next;
        if (temp == null) return;
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    void deleteByRollNo(int rollNo) {
        if (head == null) return;
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    Student searchByRollNo(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) return temp;
            temp = temp.next;
        }
        return null;
    }

    void updateGradeByRollNo(int rollNo, String newGrade) {
        Student temp = searchByRollNo(rollNo);
        if (temp != null) temp.grade = newGrade;
    }

    void displayAll() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNo + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentLinkedListDemo {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        Scanner
