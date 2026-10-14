//Superclass Variable Can Reference a Subclass Object
class tree{
    void speciality(){
        System.out.println("Trees are green");
    }
}
class flower extends tree{
    void speciality(){
        System.out.println("flowers are colorful");
    }
}

public class superclass {
    public static void main(String[] args){
        tree t = new flower();

        t.speciality();
    }
}
