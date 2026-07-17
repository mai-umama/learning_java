class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called.");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class constructor_try {
    public static void main(String[] args) {
        // Calling the default constructor
        Student s1 = new Student();
        s1.display();
    }
}
