class publication{
    String title;
    double price;
    void displayDetails(){
        System.out.println("Title:"+ title);
        System.out.println("Price:"+ price);
    }
}
class Book extends publication{
    void displayDetails() {
        System.out.println("Book Title: "+ title);
        System.out.println("Book price: "+ price);
    }
}
class Magazine extends publication{
    void displayDetails() {
        System.out.println("magazine Title: "+ title);
        System.out.println("magazine price: "+ price);
    }
}
public class inherit {
    public static void main(String[] args){
       Book b = new Book();
       Magazine m = new Magazine();
       b.title = " hello cats";
       b.price = 874;
       b.displayDetails();
        m.title = " hello bats";
        m.price = 804;
        m.displayDetails();
    }
}
