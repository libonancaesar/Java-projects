public class CertificateOfDeposit extends BankAccount{
    double limit;
    public CertificateOfDeposit(String account, double balance, double limit) {
        super(account, balance);
        this.limit = limit;
    }
}
