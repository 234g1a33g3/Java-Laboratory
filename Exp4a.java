class Animal {
    void eat() {
        System.out.println("animal eat the food");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("dog makes the sounds");
    }
}

public class Exp4a {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.eat();
    }
}
