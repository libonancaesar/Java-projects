public class CheckingAccount extends BankAccount{
    double limit;

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance);
        this.limit = limit;

    }
}
