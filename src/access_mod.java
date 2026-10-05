class details{
    public String name = "Umama" ;
    private int age = 22;
    protected String inst="MEC";
    String dept = "CSE";

    void display(){
        System.out.println("Name "+ name);
        System.out.println("Age "+ age);
        System.out.println("Institute "+ inst);
        System.out.println("Department "+ dept);
    }
}
public class access_mod {
    public static void main(String[] args){
        details d = new details();
        System.out.println("Public "+ d.name);
        //System.out.println("Private "+ d.age);
        System.out.println("Protected "+ d.inst);
        System.out.println("Default "+ d.dept);
        d.display();
    }
}
