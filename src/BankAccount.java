public class BankAccount {
    String accountnumber;
    String accountName;
    double balance;
    BankAccount(String acNo, String name, double bal){
        accountnumber =acNo;
        accountName = name;
        balance= bal;
    }
    void deposit(double amount){
        balance= balance+amount;
    }
    void withdraw(double amount){
        if(amount<= balance){
            balance = balance-amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void display_details(){
        System.out.println("Account Number: "+ accountnumber);
        System.out.println("Account Name: "+ accountName);
        System.out.println("Account Balance: "+ balance);
    }
    public static void main(String[] args){
        BankAccount b = new BankAccount("10003", "Umama", 50000);
        b.deposit(1000);
        b.withdraw(500);
        b.display_details();
    }
}
