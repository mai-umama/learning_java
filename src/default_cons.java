class learner{
    String name;
    int age;
    learner(){
        name = "Umama";
        age = 20;
    }
    void display(){
        System.out.println("Name "+ name);
        System.out.println("Age "+ age);
    }
}
public class default_cons {
    public static void main(){
        learner l = new learner();
        l.display();
    }
}
