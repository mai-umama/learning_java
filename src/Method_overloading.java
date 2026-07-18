class calculation{
    int summation(int a, int b){
        return a+b;
    }
    int summation(int a,int b,int c){
        return a+b+c;
    }
    double summation(double a, double b){
        return a+b;
    }
}


public class Method_overloading {
    public static void main(String[] args){
        calculation s1 = new calculation();
        System.out.println(s1.summation(1,6));
        System.out.println(s1.summation(1,3,5));
        System.out.println(s1.summation(8.9,3.5));
    }
}
