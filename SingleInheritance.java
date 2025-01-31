class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.bark();
    }
}
