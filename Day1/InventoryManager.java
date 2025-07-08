import java.util.Scanner;

class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;

    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

class InventoryList {
    Item head;

    void addAtBeginning(Item i) {
        i.next = head;
        head = i;
    }

    void addAtEnd(Item i) {
        if (head == null) {
            head = i;
            return;
        }
        Item temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = i;
    }

    void addAtPosition(Item i, int pos) {
        if (pos <= 0 || head == null) {
            addAtBeginning(i);
            return;
        }
        Item temp = head;
        for (int j = 1; j < pos && temp.next != null; j++) temp = temp.next;
        i.next = temp.next;
        temp.next = i;
    }

    void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    void updateQuantity(int id, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id)
                System.out.println(temp.name + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }

    void searchByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                System.out.println(temp.id + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }

    void totalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Value: " + total);
    }

    Item mergeSort(Item head, int mode, boolean byName) {
        if (head == null || head.next == null) return head;
        Item mid = getMiddle(head);
        Item nextOfMid = mid.next;
        mid.next = null;
        Item left = mergeSort(head, mode, byName);
        Item right = mergeSort(nextOfMid, mode, byName);
        return merge(left, right, mode, byName);
    }

    Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Item merge(Item a, Item b, int mode, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;
        Item result;
        boolean condition;
        if (byName) {
            condition = mode == 1 ? a.name.compareToIgnoreCase(b.name) < 0 : a.name.compareToIgnoreCase(b.name) > 0;
        } else {
            condition = mode == 1 ? a.price < b.price : a.price > b.price;
        }
        if (condition) {
            result = a;
            result.next = merge(a.next, b, mode, byName);
        } else {
            result = b;
            result.next = merge(a, b.next, mode, byName);
        }
        return result;
    }

    void sortInventory(boolean byName, int mode) {
        head = mergeSort(head, mode, byName);
    }

    void display() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryList list = new InventoryList();

        while (true) {
            int op = sc.nextInt();
            if (op == 0) break;
            if (op == 1) {
                String name = sc.next();
                int id = sc.nextInt();
                int qty = sc.nextInt();
                double price = sc.nextDouble();
                list.addAtBeginning(new Item(name, id, qty, price));
            } else if (op == 2) {
                String name = sc.next();
                int id = sc.nextInt();
                int qty = sc.nextInt();
                double price = sc.nextDouble();
                list.addAtEnd(new Item(name, id, qty, price));
            } else if (op == 3) {
                int pos = sc.nextInt();
                String name = sc.next();
                int id = sc.nextInt();
                int qty = sc.nextInt();
                double price = sc.nextDouble();
                list.addAtPosition(new Item(name, id, qty, price), pos);
            } else if (op == 4) {
                int id = sc.nextInt();
                list.removeById(id);
            } else if (op == 5) {
                int id = sc.nextInt();
                int newQty = sc.nextInt();
                list.updateQuantity(id, newQty);
            } else if (op == 6) {
                int id = sc.nextInt();
                list.searchById(id);
            } else if (op == 7) {
                String name = sc.next();
                list.searchByName(name);
            } else if (op == 8) {
                list.totalValue();
            } else if (op == 9) {
                int by = sc.nextInt();
                int mode = sc.nextInt();
                list.sortInventory(by == 1, mode);
            } else if (op == 10) {
                list.display();
            }
        }
    }
}
