public class CheckingAccount extends BanckAccount {
    double fee;

    public CheckingAccount(String number, Long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }
}