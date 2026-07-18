class calculator{
    int add(int a, int b){
        return a+b;
    }
}
public class method_basic {
    public static void main(String[] args){
        calculator c1 = new calculator();
        int result = c1.add(1,2);
        System.out.println("Result: "+ result);
    }
}
