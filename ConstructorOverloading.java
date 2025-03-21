class Books {
    String bookname;
    int cost;

    Books() {
        bookname = "Unknown";
        cost = 0;
    }

    Books(String a) {
        bookname = a;
        cost = 999;
    }

    Books(String a, int b) {
        bookname = a;
        cost = b;
    }

    void display() {
        System.out.println("Book Name: " + bookname + ", Cost: " + cost);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Books obj1 = new Books();
        Books obj2 = new Books("Core Java");
        Books obj3 = new Books("Inheritance", 199);
        
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
