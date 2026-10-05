class person{
    void work(){
        System.out.println("Every person have some works");
    }
}
class students extends person{
    void work(){
        System.out.println("Students are studying");
    }
}
class teacher extends person{
    void work() {
        System.out.println("Teachers are teaching");
    }
}

public class polymorphisam {
    public static void main(String[] args){
        person p;
        p = new students();
        p.work();

        p = new teacher();
        p.work();
    }
}
