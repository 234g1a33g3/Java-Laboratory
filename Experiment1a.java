class Experiment1a{
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;

    void displayDefaults() {
        System.out.println("Default values of primitive data types in Java:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: [" + charVar + "] (empty character)");
        System.out.println("boolean: " + booleanVar);
    }

    public static void main(String[] args) {
        Experiment1a obj = new Experiment1a ();
        obj.displayDefaults();
    }
}
