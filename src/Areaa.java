import java.util.Scanner;
public class Areaa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //circle
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        double c_area = (3.1416 * (r*r));
        System.out.println("Circle area: " + c_area);
        //rectengular
        System.out.println("Enter the length: ");
        int lenght = sc.nextInt();
        System.out.println("Enter the width: ");
        int width = sc.nextInt();
        int r_area = lenght * width;
        System.out.println("Rectangle area: "+ r_area);

        //Square
        System.out.println("Enter the side: ");
        int side = sc.nextInt();
        int s_area = (side*side);
        System.out.println("Square area: "+ s_area);

        //triangle
        System.out.println("enter the base");
        int base = sc.nextInt();
        System.out.println("enter the height");
        int height = sc.nextInt();
        double t_area =((0.5) * base* height);
        System.out.println("triangle area: "+ t_area);
    }
}
