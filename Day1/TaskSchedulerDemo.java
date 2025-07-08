import java.util.Scanner;

class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskScheduler {
    Task head = null;
    Task current = null;

    void addAtBeginning(Task t) {
        if (head == null) {
            head = t;
            t.next = head;
            current = head;
            return;
        }
        Task temp = head;
        while (temp.next != head) temp = temp.next;
        t.next = head;
        temp.next = t;
        head = t;
    }

    void addAtEnd(Task t) {
        if (head == null) {
            addAtBeginning(t);
            return;
        }
        Task temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = t;
        t.next = head;
    }

    void addAtPosition(Task t, int pos) {
        if (pos <= 0 || head == null) {
            addAtBeginning(t);
            return;
        }
        Task temp = head;
        for (int i = 1; i < pos && temp.next != head; i++) temp = temp.next;
        t.next = temp.next;
        temp.next = t;
    }

    void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            if (head.next == head) {
                head = null;
                current = null;
                return;
            }
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = head.next;
            if (current == head) current = head.next;
            head = head.next;
            return;
        }
        Task prev = head, temp = head.next;
        while (temp != head && temp.id != id) {
            prev = temp;
            temp = temp.next;
        }
        if (temp.id == id) {
            prev.next = temp.next;
            if (current == temp) current = temp.next;
        }
    }

    void viewCurrentAndNext() {
        if (current == null) return;
        System.out.println("Current Task: " + current.id + ", " + current.name + ", " + current.priority + ", " + current.dueDate);
        current = current.next;
    }

    void displayAll() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int p) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == p)
                System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}

public class TaskSchedulerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        while (true) {
            int op = sc.nextInt();
            if (op == 0) break;
            if (op == 1) {
                int id = sc.nextInt();
                String name = sc.next();
                int pri = sc.nextInt();
                String due = sc.next();
                scheduler.addAtBeginning(new Task(id, name, pri, due));
            } else if (op == 2) {
                int id = sc.nextInt();
                String name = sc.next();
                int pri = sc.nextInt();
                String due = sc.next();
                scheduler.addAtEnd(new Task(id, name, pri, due));
            } else if (op == 3) {
                int pos = sc.nextInt();
                int id = sc.nextInt();
                String name = sc.next();
                int pri = sc.nextInt();
                String due = sc.next();
                scheduler.addAtPosition(new Task(id, name, pri, due), pos);
            } else if (op == 4) {
                int id = sc.nextInt();
                scheduler.removeById(id);
            } else if (op == 5) {
                scheduler.viewCurrentAndNext();
            } else if (op == 6) {
                scheduler.displayAll();
            } else if (op == 7) {
                int p = sc.nextInt();
                scheduler.searchByPriority(p);
            }
        }
    }
}
