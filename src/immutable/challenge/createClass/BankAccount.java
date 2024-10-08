package immutable.challenge.createClass;


public class BankAccount {

    public enum AccountType {CHECKING, SAVINGS}

    private final AccountType type;
    private final double balance;

     BankAccount(AccountType type, double balance) {
        this.type = type;
        this.balance = balance;

    }

    public AccountType getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return type + " " + balance + "\n";
    }
}
