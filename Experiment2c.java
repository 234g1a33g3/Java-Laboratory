class Person {
    String name;
    int age;
    Person(String a, int b) {
        name = a;
        age = b;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("*****ALL THE BEST*****");
    }
}
public class Experiment2c{
    public static void main(String[] args) {
        Person obj1 = new Person("Shiva Reddy", 20);
        Person obj2 = new Person("Vivek", 23);
        obj1.display();
        obj2.display();
    }
}