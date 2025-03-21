class Person{
    String name;
    int age;
    String rollno;
    Person(String name, int age, String rollno) {
        this.name = name;
        this.age = age;
        this.rollno= rollno;
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rollno: " + rollno);

    }
}
public class Experiment2a{
    public static void main(String[] args) {
        Person person1 = new Person("Shiva Reddy",20, "234g1a33g3");
        person1.displayInfo();
    }
}