import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_of_Subjects= 5;
        double total_gradePoint = 0;
        for(int i =1;i<=num_of_Subjects;i++) {
            System.out.println("Enter The Grade (A/B/C/D/F: ");
            char grade = sc.next().toUpperCase().charAt(0);
            double gradepoint;
            switch (grade) {
                case 'A':
                    gradepoint=4.0;
                    break;
                case'B':
                    gradepoint=3.0;
                    break;
                case'C':
                    gradepoint=2.0;
                    break;
                case'D':
                    gradepoint=1.0;
                    break;
                case'F':
                    gradepoint=0.0;
                    break;
                default:
                    System.out.println("Invalid choice");
                    gradepoint=0.0;
            }
            total_gradePoint+= gradepoint;
        }
        double cgpa = total_gradePoint / num_of_Subjects;
        System.out.println("CGPA "+cgpa);
        sc.close();
    }
}