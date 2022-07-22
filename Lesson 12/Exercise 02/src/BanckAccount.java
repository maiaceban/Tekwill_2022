public class BanckAccount {
    protected String number;
    protected Long balance;


    /*
You are given a class named BankAccount. The class has two fields: number and balance.
Define two classes which inherit from the BankAccount:
● CheckingAccount containing the double field fee.
● SavingAccount containing the double field interestRate.
Each new class should have a constructor with three parameters:
● CheckingAccount(String number, Long balance, double fee)
● SavingAccount(String number, Long balance, double interestRate)
Do not forget to invoke the superclass constructor when creating objects.
     */

    public BanckAccount(String number, Long balance) {
        this.number = number;
        this.balance = balance;
    }
}