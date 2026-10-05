class pupil{
    String name;
    int age;
    //parameterized constructor
    pupil(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class parameterized_cons {
    public static void main(String[] args){
        pupil pt = new pupil("Muaz", 23);
        pt.display();
    }
}
