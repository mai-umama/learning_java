class Animal{
    void eat(){
        System.out.println("Animal eats food");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
public class inheritenceDemo {
    public static void main(String[] args){
        dog d = new dog();
        d.eat();
        d.bark();
    }
}
