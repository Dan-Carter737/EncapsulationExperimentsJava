public class ChildBankAccount {

    private double balance;
    private double maxBalance;

    public ChildBankAccount(double maxBalance) {

        this.maxBalance = maxBalance;
    }
    public boolean depositMoney(double value) {
        if(value < 0) {
            return false;
        }
        else if((getBalance() + value) > maxBalance) {
            return false;
        }
        else {
            balance += value;
            return true;
        }

    }
    public boolean debitMoney(double value) {
     if((getBalance() - value) <= 0) {
        return false;
     }
     else if (value < 0) {
         return false;
     }
     else {
         balance -= value;
         return  true;
     }
    }
    public double getBalance() {
        return balance;
    }
}
