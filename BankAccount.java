package CLass1;

public class BankAccount {
    double balance;
    String ownerName;
    public void withdraw(double amount) {
        if (this.balance > 0) {
            this.balance -= amount;
        }
    }
        public void deposit(double amount){
            this.balance+=amount;
        }

}
