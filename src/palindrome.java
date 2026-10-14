import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int orignal = n;
        int reverse=0;
        while(n!=0){
            int digit = n%10;
            reverse= reverse*10 + digit;
            n = n/10;
        }
        if(orignal==reverse){
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("the number is not palindrome");
        }
    }
}
