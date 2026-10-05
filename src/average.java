import java.util.Scanner;
public class average {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n = sc.nextInt();
    System.out.println("Enter the elements: ");
    double sum = 0;
    for(int i = 0;i<n;i++){
        double num = sc.nextDouble();
        sum = sum + num;
    }
    double average = sum/n;
    System.out.println("The average: " + average);
}
}
