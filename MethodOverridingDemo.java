class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();  
        Dog d = new Dog();
        d.makeSound();  
    }
}