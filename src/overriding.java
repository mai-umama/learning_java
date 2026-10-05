class Animals {
    void sound() {
        System.out.println("Animals make sound");
    }
}
    class cat extends Animals{
        @Override
        void sound(){
            System.out.println("Cats Meows");
        }
    }

public class overriding {
    public static void main(String[] args){
        cat c = new cat();
        c.sound();
    }
}
