class Animal {
    void eat() {
        System.out.println("animal eats the food.");
    }
}

class Mammals extends Animal {
    void mammel() {
        System.out.println("mammels are living in forest");
    }
}

class Dog extends Mammals {
    void sounds() {
        System.out.println("dogs makes the sounds");
    }
}

public class Exp4b {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.mammel();
        obj.sounds();
    }
}
