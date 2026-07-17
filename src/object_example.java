class student{
    String name;
    int age;
    void dispaly(){
        System.out.println("Name: "+name + "Age: "+age);
    }
}
public class object_example {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Umama";
        s1.age = 21;
        s1.dispaly();
    }
}
