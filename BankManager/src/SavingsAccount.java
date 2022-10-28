public class SavingsAccount extends BankAccount{
    double limit;
    public SavingsAccount(String account, double balance, double limit) {
        super(account, balance);
        this.limit = limit;
    }


}
