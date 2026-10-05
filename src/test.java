class Employee{
    String name;
    double salary;
    Employee(String n, double s){
        name = n;
        salary = s;
    }
    double calculateBonus(){
        return 0;
    }
}
class Manager extends Employee{
    Manager(String n, double s){
       super(n,s);
    }
    double calculateBonus() {
        return salary *20/100;
    }
}
class Developer extends Employee{
    Developer(String n, double s){
        super(n,s);
    }
    double calculateBonus() {
        return salary *10/100;
    }
}
public class test {
    public static void main(String[] args){
        Manager m = new Manager("Rahim", 20000);
        Developer d = new Developer("Karim", 10000);

        System.out.println(m.calculateBonus());
        System.out.println(d.calculateBonus());
    }
}
