class animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends animal{
    @Override
    void sound(){
        System.out.println("dog makes sound");
    }
}
public class runtimepoly {
    public static void main(String[] args){
        animal a = new Dog();
        a.sound();
    }
}
