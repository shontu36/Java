package CLass1;

public class BankAccount {
    double balance;
    String ownerName;
    public void withdraw(double amount) {
        if (balance > 0 && balance>=amount) {
           balance -= amount;
        }
        System.out.println("Withdrawn amount is " + balance);
    }
        public void deposit(double amount){
            this.balance+=amount;

        System.out.println("New amount "+ balance);}

}
