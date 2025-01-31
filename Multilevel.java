class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Mammal extends Animal {
    void warmBlooded() {
        System.out.println("Mammals are warm-blooded");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.warmBlooded();
        dog.bark();
    }
}

