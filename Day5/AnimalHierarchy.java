class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    void makeSound() {
        System.out.println("Tweet");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Tommy", 3),
            new Cat("Whiskers", 2),
            new Bird("Sparrow", 1)
        };
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
