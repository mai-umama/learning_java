class calculation{
    void add(int a, int b){
        System.out.println("Sum: " +(a+b));
    }
    void add(double a, double b){
        System.out.println("Sum: "+ (a+b));
    }
    void add(int a,int b, int c){
        System.out.println("Sum: "+ (a+b+c));
    }
}
public class Method_overloading{
    public static void main(String[] args){
        calculation c = new calculation();
        c.add(1,2);
        c.add(5.8, 9.3);
        c.add(7,8,9);
    }
}