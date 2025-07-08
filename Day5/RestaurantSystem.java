interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    String specialty;
    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }
    public void performDuties() {
        System.out.println("Chef preparing " + specialty);
    }
}

class Waiter extends Person implements Worker {
    String shift;
    Waiter(String name, int id, String shift) {
        super(name, id);
        this.shift = shift;
    }
    public void performDuties() {
        System.out.println("Waiter working in " + shift + " shift");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Worker w1 = new Chef("Arjun", 101, "Italian");
        Worker w2 = new Waiter("Suman", 102, "Evening");
        w1.performDuties();
        w2.performDuties();
    }
}
