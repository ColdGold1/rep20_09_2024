package immutable.challenge.createClass;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCustomer {

    private static int lastCustomerId = 10_000;

    private final String customerName;
    private final int customerId;
    private final List<BankAccount> accounts = new ArrayList<>();


    public BankCustomer(String customerName,
                        double checkingAmount, double savingAmount) {
        this.customerName = customerName;
        this.customerId = lastCustomerId++;
        accounts.add(new BankAccount(BankAccount.AccountType.CHECKING, checkingAmount));
        accounts.add(new BankAccount(BankAccount.AccountType.SAVINGS, savingAmount));

    }

    public String getCustomerName() {
        return customerName;
    }

    public int getId() {
        return customerId;
    }

    public List<BankAccount> getAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public String toString() {
        String[] accountStrings = new String[accounts.size()];
        Arrays.setAll(accountStrings, i -> accounts.get(i).toString());
        return "Customer: %s (id=%015d)%n\t%s%n".formatted(customerId, customerId,
                String.join("\t",accountStrings));
    }
}
