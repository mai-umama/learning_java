class Outerclass{
    interface InnerInterface {
        void display();
    }
}
class Demo implements Outerclass.InnerInterface{
    @Override
    public void display() {
        System.out.println("Nested interface implemented");
    }
}
public class nested_interface {
    public static void main(String[] args){
        Demo d = new Demo();
        d.display();
    }
}
