class Shape{
    void display(){
        System.out.println("That is the shape");
    }
}
class rectagle extends Shape{
    void area() {
        int length = 5;
        int width = 6;
        System.out.println("Area :" + (length* width));
    }
}
class square extends Shape{
    void area() {
        int side = 5;
        System.out.println("Area :" + (side * side));
    }
}
public class inheritence {
    public static void main(String[] args){
        rectagle r = new rectagle();
        square s = new square();

        r.display();
        r.area();

        s.display();
        s.area();
    }
}
