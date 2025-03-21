class Marks {
    void print(String name) {
        System.out.println("Name of the student: " + name);
    }
    void print(double marks) {
        System.out.println("OOPJ (java) marks: " + marks);
    }
    void print(int marks) {
        System.out.println("OOPJLAB (java lab) marks: " + marks);
        System.out.println("*****All the best*****");
    }
}

public class Experiment2b {
    public static void main(String[] args) {
        Marks obj = new Marks();
        obj.print("Shiva Reddy");
        obj.print(99.5);
        obj.print(98);
    }
}
