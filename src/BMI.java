import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the weight in kg");
        double weight = sc.nextDouble();
        System.out.println("enter the height in meter");
        double height = sc.nextDouble();
        double bmi = (weight/(height*height));
        System.out.println("BMI: "+ bmi);
    }
}
